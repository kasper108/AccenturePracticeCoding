package Day9;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket clientSocket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientName;

    public Client(Socket clientSocket, String clientName) {
        try {
            this.clientSocket = clientSocket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            this.clientName = clientName;
        } catch (IOException e){
            closeClient(clientSocket, bufferedReader , bufferedWriter);
        }
    }

    public void sendMessage(){
        try{
            Scanner scanner = new Scanner(System.in);

            bufferedWriter.write(clientName);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            while(clientSocket.isConnected()){
                String messageToSend = scanner.nextLine();
                bufferedWriter.write(clientName + " says: " + messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch(IOException e){
            closeClient(clientSocket, bufferedReader , bufferedWriter);
        }
    }

    public void listenToMessages(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String messageFromChat;
                while(clientSocket.isConnected()){
                    try{
                        messageFromChat = bufferedReader.readLine();
                        System.out.println(messageFromChat);
                    } catch(IOException e){
                        closeClient(clientSocket, bufferedReader , bufferedWriter);
                    }
                }
            }
        }).start();
    }

    public void closeClient(Socket clientSocket , BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        try{
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(bufferedWriter != null){
                bufferedWriter.close();
            }
            if(clientSocket != null){
                clientSocket.close();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter yours username : ");
        String clientName = scanner.nextLine();
        Socket clientSocket = new Socket("localhost", 1234);
        Client client = new Client(clientSocket, clientName);
        client.listenToMessages();
        client.sendMessage();
    }
}
