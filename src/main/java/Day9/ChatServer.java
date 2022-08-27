package Day9;

import lombok.AllArgsConstructor;

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
                ClientChat clientChat = new ClientChat(clientSocket);
            }
        }
    }

}
