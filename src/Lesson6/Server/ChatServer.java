package Lesson6.Server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    private ServerSocket serversocket;
    private Socket socket;

    public ChatServer() {
        try {
            serversocket = new ServerSocket(5000);
            System.out.println("Server wait connection");
            socket = serversocket.accept();
            System.out.println("Client connected with IP: " + socket.getInetAddress().getHostAddress());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            new Thread(() -> {
                while (true) {
                    try {
                        String msg = sc.nextLine();
                        out.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            while (true) {
                String msg = in.readUTF();
                System.out.println("Client: " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatServer();
    }
}
