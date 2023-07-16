package Org.SwingProject;

import javax.swing.*;
import java.awt.*;

public class SwingCardLayout {
    public static void main(String[] args){

        JFrame f = new JFrame("Simple");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        pane.setLayout(new BorderLayout());

        //card layout
        CardLayout cardLayout = new CardLayout();
        JPanel myContainer = new JPanel(cardLayout);

        for(int i=0; i<10; i++){
            myContainer.add(new JLabel("Card"+i),BorderLayout.CENTER);
        }


        JButton b = new JButton("Next");
        b.addActionListener((e)->{
            cardLayout.next(myContainer);
        });

        pane.add(myContainer, BorderLayout.CENTER);
        pane.add(b, BorderLayout.SOUTH);

        f.setBounds(100, 100, 300, 300);
        f.setVisible(true);
    }
}
