package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Locuri extends JFrame {
    String[] randuri = { "1", "2", "3", "4" ,"5","6","7"};
    JComboBox<String> formatBox1 = new JComboBox<>(randuri);
    String[] loc = { "1", "2", "3", "4" ,"5","6","7"};
    JComboBox<String> formatBox2 = new JComboBox<>(randuri);
    JButton finish=new JButton("Achizitionare bilet");
    JButton anulare=new JButton("Anulare rezervare");

    public Locuri() {
        super("Lista de spectacole");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel pane = new JPanel();
        JLabel formatLabel = new JLabel("Rand: ");
        pane.setBackground(Color.red);
        pane.add(formatLabel);
        pane.add(formatBox1);
        JLabel loc = new JLabel("Loc: ");
        pane.add(loc);
        pane.add(formatBox2);
        pane.add(finish);
        pane.add(anulare);
        anulare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
        Locuri.setLookAndFeel();
        Locuri ff = new Locuri();
    }
}
