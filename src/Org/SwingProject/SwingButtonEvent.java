package Org.SwingProject;

import javax.swing.*;
import java.awt.*;

public class SwingButtonEvent {
    public static void main(String[] args){

        JFrame f = new JFrame("Simple");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        pane.setLayout(new BorderLayout());

       // final int[] ctrVariable = {0};

//        JLabel label = new JLabel(Integer.toString(ctrVariable[0]));
//        pane.add(label, BorderLayout.CENTER);

        JButton ctrButton = new JButton("  ");
        pane.add(ctrButton, BorderLayout.SOUTH);

        //adding event lister to the button using lambda function
        ctrButton.addActionListener((event) ->{
            if(ctrButton.getText().equals("   ")){
                ctrButton.setText("X");
            }
            else if(ctrButton.getText().equals("X")){
                ctrButton.setText("O");
            }
            else{
                ctrButton.setText("X");
            }
//            label.setText(Integer.toString(ctrVariable[0]));
        });


        f.setBounds(100, 100, 300, 300);
        f.pack();
        f.setVisible(true);
    }
}
