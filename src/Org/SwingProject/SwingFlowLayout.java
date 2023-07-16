package Org.SwingProject;

import javax.swing.*;
import java.awt.*;

public class SwingFlowLayout {
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple");

        //when we close the jframe window the program is still runs in the background
        //we have to explicitly define to exit the program on close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //getting the content pane of frame
        Container pane = frame.getContentPane();


        //changing the pane layout to flow layout
        pane.setLayout(new FlowLayout());
        for(int i =0; i<10; i++) {
            pane.add(new JButton("Button"+i));
        }
//        frame.setBounds(400, 200, 350, 350);

        //instead of setting the frame a fixed size we can make it dynamic by
        //the content available in the frame
        frame.pack();
        frame.setVisible(true);
    }
}
