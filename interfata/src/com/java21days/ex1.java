package com.java21days;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

class ex1 {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Teatru Online");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Teatru Online");
        //JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton login = new JButton("Autentificare");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new Autentificare();
            }
        });
        JButton register = new JButton("Inregistrare cont");
        register.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                new Inregistrare();
            }
        });
        JButton spectacole = new JButton("Spectacolele Noastre");
        spectacole.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                new Spectacole();
            }
        });
        panel.add(BorderLayout.NORTH,label); // Components Added using Flow Layout
        panel.setBackground(Color.white);

        //panel.add(tf);

        panel.add(BorderLayout.CENTER,login);

        panel.add(BorderLayout.AFTER_LAST_LINE,register);
        panel.add(BorderLayout.LINE_START,spectacole);
        // Text Area at the Center
        JTextArea ta = new JTextArea();
        ta.setSize(10,10);

        JButton logout=new JButton("Log out");
        logout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                new Autentificare();
            }
        });
        //Adding Components to the frame.
        frame.getContentPane().setBackground(Color.blue);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        //frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.SOUTH, logout);
        frame.setVisible(true);
    }
}