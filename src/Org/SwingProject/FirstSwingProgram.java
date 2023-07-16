package Org.SwingProject;
import javax.swing.*;
import java.awt.*;
public class FirstSwingProgram {
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple");
        //the space inside the frame is called as content frame
        //we can add content to the frame

        //adding button to the frame
        JButton b1 = new JButton("Button 1");

        //when we add another button to the content pane
        //all items by default go to the center pane
        //that is why we have to set the location of button in the content pane

        JButton b2 = new JButton("Button 2");

        //adding button to the content pane
        frame.getContentPane().add(b1, BorderLayout.EAST);
        frame.getContentPane().add(b2, BorderLayout.WEST);

        //adding button to the content pane in single line
        frame.getContentPane().add(new JButton("Button 2"), BorderLayout.NORTH);

        frame.setBounds(400, 200, 350, 350);
        frame.setVisible(true);

    }
}
