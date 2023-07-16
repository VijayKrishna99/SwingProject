package Org.SwingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingJButtonMouseEvent {

    public static void main(String[] args){
        JFrame f = new JFrame("Simple");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        pane.setLayout(new BorderLayout());

        // final int[] ctrVariable = {0};

//        JLabel label = new JLabel(Integer.toString(ctrVariable[0]));
//        pane.add(label, BorderLayout.CENTER);

        JButton ctrButton = new JButton("");


        pane.add(ctrButton, BorderLayout.CENTER);

        ctrButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ctrButton.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e){
                ctrButton.setText("Mouse has left");
            }

            @Override
            public void mouseClicked(MouseEvent e){
                ctrButton.setText("Mouse has been clicked");
            }

        });

        f.setBounds(100, 100, 300, 300);
        f.setVisible(true);
    }
}
