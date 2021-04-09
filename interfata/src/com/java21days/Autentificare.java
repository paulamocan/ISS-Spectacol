package com.java21days;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Autentificare extends javax.swing.JFrame {
     JTextField username = new JTextField(15);
     JPasswordField password = new JPasswordField(15);
     //JTextArea comments = new JTextArea(4, 15);
     JButton submit = new JButton("submit");
     JButton cancel = new JButton("Cancel");

     public Autentificare() {
         super("Intra in cont");
         setSize(300, 220);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JPanel pane = new JPanel();
         pane.setBackground(Color.red);
         JLabel usernameLabel = new JLabel("Username: ");
         JLabel passwordLabel = new JLabel("Password: ");
         //JLabel commentsLabel = new JLabel("Comments: ");
         //comments.setLineWrap(true);
         //comments.setWrapStyleWord(true);
         pane.add(usernameLabel);
         pane.add(username);
         pane.add(passwordLabel);
         pane.add(password);
         //pane.add(commentsLabel);
         //pane.add(comments);
         pane.add(submit);
         submit.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 new Spectacole();
             }
         });
         pane.add(cancel);
         JTextArea nou=new JTextArea("Nu ai cont? Creeaza-ti unul nou.");
         nou.setBackground(Color.RED);
         pane.add(BorderLayout.SOUTH,nou);
        JButton creeaza=new JButton("Cont nou");
        pane.add(BorderLayout.SOUTH,creeaza);
         creeaza.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 new Inregistrare();
             }
         });
         add(pane);
         setVisible(true);
     }

     static void setLookAndFeel() {
         try {
             UIManager.setLookAndFeel(
                 "javax.swing.plaf.nimbus.NimbusLookAndFeel"
             );
         } catch (Exception exc) {
             System.out.println(exc.getMessage());
         }
     }

     public static void main(String[] arguments) {
         Autentificare.setLookAndFeel();
         Autentificare auth = new Autentificare();
     }
 }
