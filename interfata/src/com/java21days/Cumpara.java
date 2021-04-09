package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cumpara extends JFrame {
     JRadioButton[] teams = new JRadioButton[4];
    String[] randuri = { "1", "2","3","4","5","6" };
    JComboBox<String> formatBox1 = new JComboBox<>(randuri);

     public Cumpara() {
         super("Choose an Output Format");
         setSize(200, 150);
         setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         teams[0] = new JRadioButton("1 bilet",true);
         teams[1] = new JRadioButton("2 bilete");
         teams[2] = new JRadioButton("3 bilete");
         teams[3] = new JRadioButton("4 bilete");
         JPanel panel = new JPanel();
         JLabel chooseLabel = new JLabel(
             "Cate locuri doresti sa rezervi:");
         panel.add(BorderLayout.CENTER,chooseLabel);
         JLabel formatLabel = new JLabel("Rand:");
         teams[0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 new Locuri();
             }
         });
         teams[1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 new Locuri();
             }
         });
         teams[2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 new Locuri();
             }
         });
         teams[3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 new Locuri();
             }
         });

         ButtonGroup group = new ButtonGroup();
         for (JRadioButton team : teams) {
             group.add(team);
             panel.add(BorderLayout.CENTER,team);
         }
            add(panel);
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
         Cumpara.setLookAndFeel();
         Cumpara ff = new Cumpara();
     }
}
