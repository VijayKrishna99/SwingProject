package Org.SwingProject;

import javax.swing.*;
import java.awt.*;
public class SwingJPanel {
    public static void main(String[] args){

        JFrame f = new JFrame("Simple");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = f.getContentPane();
        pane.setLayout(new BorderLayout(20, 20));
        JPanel panel = new JPanel(new FlowLayout());

        panel.add(new JButton("b1"));
        panel.add(new JButton("b2"));

        pane.add(panel, BorderLayout.EAST);

        f.pack();
        f.setVisible(true);
    }
}
