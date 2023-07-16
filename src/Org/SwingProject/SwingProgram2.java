package Org.SwingProject;

import javax.swing.*;
import java.awt.*;

public class SwingProgram2 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple");

        //when we close the jframe window the program is still runs in the background
        //we have to explicitly define to exit the program on close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //getting the content pane of frame
        Container pane = frame.getContentPane();

        //adding new Label to the content pane
        pane.add(new JLabel("Hello"));

        frame.setBounds(400, 200, 350, 350);
        frame.setVisible(true);
    }

}
