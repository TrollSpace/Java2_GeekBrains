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
        JTextField jTextField = new JTextField();
        JButton jb = new JButton("SEND");
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jTextField, jTextArea);
            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jTextField, jTextArea);
            }
        });
        setLayout(new BorderLayout());
        add(jTextArea, BorderLayout.CENTER);
        add(jTextField, BorderLayout.SOUTH);
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
