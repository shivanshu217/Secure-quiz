package serverpackage;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String args[]) {
        ServerSocket serverSocket;
        Socket socket;
        try {
            serverSocket = new ServerSocket(5436);
        } catch (IOException e) {
            return;
        }
        while (true) {
            try {
                System.out.println("hello");
                socket = serverSocket.accept();
               HandleClient handleclient =new HandleClient(socket);
                System.out.println("hellosocket");
                Thread t = new Thread(handleclient);
                t.start();
            } catch (IOException e) {
                return;
            }

        }
    }

}