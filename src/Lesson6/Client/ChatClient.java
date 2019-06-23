package Lesson6.Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    Socket socket;

    public ChatClient() {
        try {
            socket = new Socket("localhost", 5000);
            System.out.println("Write your message:");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            new Thread(() -> {
                while (true) try {
                    String msg = sc.nextLine();
                    out.writeUTF(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            while (true) {
                String msg = in.readUTF();
                System.out.println("server: " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}
