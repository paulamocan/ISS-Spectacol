package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inregistrare extends javax.swing.JFrame {
    JTextField Nume = new JTextField(15);
    JTextField Prenume = new JTextField(15);
    JTextField Email=new JTextField(15);
    JPasswordField password = new JPasswordField(15);

    JButton inreg = new JButton("register");
    JButton cancel = new JButton("Cancel");

    public Inregistrare() {
        super("Intra in cont");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        pane.setBackground(Color.red);
        JLabel nume = new JLabel("Nume: ");
        JLabel prenume=new JLabel("Prenume: ");
        JLabel email=new JLabel("Email: ");
        JLabel passwordLabel = new JLabel("Parola: ");
        //JLabel commentsLabel = new JLabel("Comments: ");
        //comments.setLineWrap(true);
        //comments.setWrapStyleWord(true);
        pane.add(nume);
        pane.add(Nume);
        pane.add(BorderLayout.AFTER_LAST_LINE,prenume);
        pane.add(BorderLayout.LINE_START,Prenume);
        pane.add(email);
        pane.add(Email);
        pane.add(passwordLabel);
        pane.add(password);
        //pane.add(commentsLabel);
        //pane.add(comments);
        pane.add(inreg);
        inreg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new Spectacole();
            }
        });
        pane.add(cancel);
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
        Inregistrare.setLookAndFeel();
        Inregistrare auth = new Inregistrare();
    }
}

