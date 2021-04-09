package com.java21days;

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

public class Spectacole extends JFrame {
     String[] formats = { "Trandafirii de piatra", "Atentie, aterizam!", "Romeo si Julieta", "Scufita Rosie" };
     JComboBox<String> formatBox = new JComboBox<>(formats);
     JButton rezerva=new JButton("Cumpara bilet");

     public Spectacole() {
         super("Lista de spectacole");
         setSize(220, 220);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JPanel pane = new JPanel();
         JLabel formatLabel = new JLabel("Spectacolele noastre:");
         formatLabel.setBackground(Color.RED);
         pane.setBackground(Color.white);
         pane.add(formatLabel);
         pane.add(formatBox);
         rezerva.setBackground(Color.RED);
         pane.add(rezerva);
         rezerva.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 new Cumpara();
             }
         });
         add(pane);
         setVisible(true);
     }

     private static void setLookAndFeel() {
         try {
             UIManager.setLookAndFeel(
                 "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
             );
         } catch (Exception exc) {
             System.out.println(exc.getMessage());
         }
     }

     public static void main(String[] arguments) {
         Spectacole.setLookAndFeel();
         Spectacole ff = new Spectacole();
     }
}