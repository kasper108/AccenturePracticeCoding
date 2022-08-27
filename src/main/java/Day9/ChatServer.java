package Day9;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@AllArgsConstructor
public class ChatServer {

    private ServerSocket chatServerSocket;

    public void startChatServer(){
        try{
            while(!chatServerSocket.isClosed()){
                Socket clientSocket = chatServerSocket.accept();
                System.out.println("New chat user connected !");
                ClientFunctionality clientChat = new ClientFunctionality(clientSocket);

                Thread thread = new Thread(clientChat);
                thread.start();

            }
        } catch (IOException e) {

        }
    }

    public void closeChatServerSocket(){
        try{
            if(chatServerSocket != null){
                chatServerSocket.close();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket chatServerSocket = new ServerSocket(1234);
        ChatServer server = new ChatServer(chatServerSocket);
        server.startChatServer();
    }
}
