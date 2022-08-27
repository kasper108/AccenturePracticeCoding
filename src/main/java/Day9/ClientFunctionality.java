package Day9;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientFunctionality implements Runnable{

    public static ArrayList<ClientFunctionality> clientSides = new ArrayList<>();
    private Socket clientSocket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientName;

    public ClientFunctionality(Socket clientSocket){
        try{
            this.clientSocket = clientSocket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            this.clientName = bufferedReader.readLine();
            clientSides.add(this);
            sendMessage("CHAT -> " + clientName + " has entered the chat right now ...");
        } catch(IOException e) {
            closeClient(clientSocket, bufferedReader , bufferedWriter);
        }
    }

    @Override
    public void run() {
        String messageFromClient;
        while(clientSocket.isConnected()){
            try{
                messageFromClient = bufferedReader.readLine();
                sendMessage(messageFromClient);
            } catch(IOException e){
                closeClient(clientSocket, bufferedReader , bufferedWriter);
                break;
            }
        }
    }

    public void sendMessage(String messageToSend){
        for(ClientFunctionality clientSide : clientSides){
            try{
                if(!clientSide.clientName.equals(clientName)){
                    clientSide.bufferedWriter.write(messageToSend);
                    clientSide.bufferedWriter.newLine();
                    clientSide.bufferedWriter.flush();
                }
            } catch(IOException e){
                closeClient(clientSocket, bufferedReader , bufferedWriter);
            }
        }
    }

    public void closeClientSide(){
        clientSides.remove(this);
        sendMessage("CHAT -> " + clientName + " has left the chat right now ...");
        // ????
    }

    public void closeClient(Socket clientSocket , BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        closeClientSide();
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
}
