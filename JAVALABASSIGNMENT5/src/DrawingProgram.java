import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingProgram extends JFrame {
    private JPanel drawingPanel;
    private JButton lineButton, rectangleButton, ovalButton;
    private Shape currentShape = null;
    private int startX, startY;

    public DrawingProgram() {
        setTitle("Drawing Program");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        drawingPanel = new JPanel();
        drawingPanel.setBackground(Color.WHITE);
        drawingPanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

            public void mouseReleased(MouseEvent e) {
                int endX = e.getX();
                int endY = e.getY();

                if (currentShape == Shape.LINE) {
                    drawingPanel.getGraphics().drawLine(startX, startY, endX, endY);
                } else if (currentShape == Shape.RECTANGLE) {
                    int width = Math.abs(endX - startX);
                    int height = Math.abs(endY - startY);
                    int x = Math.min(startX, endX);
                    int y = Math.min(startY, endY);
                    drawingPanel.getGraphics().drawRect(x, y, width, height);
                } else if (currentShape == Shape.OVAL) {
                    int width = Math.abs(endX - startX);
                    int height = Math.abs(endY - startY);
                    int x = Math.min(startX, endX);
                    int y = Math.min(startY, endY);
                    drawingPanel.getGraphics().drawOval(x, y, width, height);
                }
            }
        });

        lineButton = new JButton("Line");
        rectangleButton = new JButton("Rectangle");
        ovalButton = new JButton("Oval");

        lineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShape = Shape.LINE;
            }
        });

        rectangleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShape = Shape.RECTANGLE;
            }
        });

        ovalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShape = Shape.OVAL;
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(lineButton);
        buttonPanel.add(rectangleButton);
        buttonPanel.add(ovalButton);

        add(drawingPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private enum Shape {
        LINE,
        RECTANGLE,
        OVAL
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DrawingProgram().setVisible(true);
            }
        });
    }
}
