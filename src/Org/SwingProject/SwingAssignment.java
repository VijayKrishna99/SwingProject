package Org.SwingProject;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;

public class SwingAssignment {
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple");

        frame.setLayout(new BorderLayout(20, 20));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        Container pane = frame.getContentPane();

        pane.add(b1, BorderLayout.EAST);
        pane.add(b2, BorderLayout.WEST);
        pane.add(b3, BorderLayout.SOUTH);
        pane.add(b4, BorderLayout.NORTH);
        pane.add(b5, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
