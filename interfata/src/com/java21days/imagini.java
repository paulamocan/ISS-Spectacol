package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class imagini extends JFrame {


     public imagini() {

         //Creating the Frame
         JFrame frame = new JFrame("Teatru Online");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500, 500);
         JButton b1=new JButton("Spectacolele Noastre");
         b1.setPreferredSize(new Dimension(10, 10));
         b1.setBackground(Color.orange);
         JButton b2=new JButton("Autentificare");
         b2.setBackground(Color.magenta);

         //Adding Components to the frame.
         frame.getContentPane().setBackground(Color.blue);
         frame.getContentPane().add(BorderLayout.NORTH, b1);
         frame.getContentPane().add(BorderLayout.SOUTH, b2);
         frame.getContentPane().add(b1);
         //frame.getContentPane().add(b2, FlowLayout.LEFT);
         frame.setVisible(true);
     }

    public static void main(String[] arguments) {
         imagini ike = new imagini();
     }
}
