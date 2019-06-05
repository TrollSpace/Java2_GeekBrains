package Lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    public ChatWindow() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 400, 600, 400);
        JTextArea jTextArea = new JTextArea();
        JTextField textField = new JTextField();
        JButton jb = new JButton("SEND");
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(textField, jTextArea);
            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(textField, jTextArea);
            }
        });
        setLayout(new BorderLayout());
        add(jTextArea, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
        add(jb, BorderLayout.EAST);
        setVisible(true);
    }

    private void sendMessage(JTextField textField, JTextArea jTextArea) {
        String out = textField.getText();
        jTextArea.append(out);
        textField.setText("");
        textField.grabFocus();
    }

    public static void main(String[] args) {
        new ChatWindow();
    }
}
