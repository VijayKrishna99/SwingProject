package Org.SwingProject;

import javax.swing.*;
import java.awt.*;

public class JavaPrimenumberAssignment {
    public static void main(String[] args){
        JFrame f = new JFrame("Simple");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        pane.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 3, 5, 5));

        final JButton[] buttons = new JButton[9];
        for(int i=0; i<9; i++){
            JButton tmp = new JButton("  ");
            buttons[i] = tmp;
            panel.add(buttons[i]);
        }

        for(int i=0; i<9; i++){
            buttons[i].addActionListener((event)->{
                JButton tmp = (JButton) event.getSource();
                if(tmp.getText().equals("  "))
                    tmp.setText("X");
                else if(tmp.getText().equals("X"))
                    tmp.setText("O");
                else if(tmp.getText().equals("O"))
                    tmp.setText("  ");
            });
        }

        pane.add(panel);
        f.setBounds(200, 200, 200, 200);
        f.setVisible(true);
    }
}
