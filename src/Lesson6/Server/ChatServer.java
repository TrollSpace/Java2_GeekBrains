package Lesson6.Server;


import java.io.*;
import java.net.*;

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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatServer();
    }
}
