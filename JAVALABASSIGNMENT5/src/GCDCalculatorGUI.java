import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GCDCalculatorGUI extends JFrame {
    private JTextField num1Field, num2Field, gcdField;
    private JButton gcdButton, clearButton, exitButton;

    public GCDCalculatorGUI() {
        setTitle("GCD Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel num1Label = new JLabel("Enter num1:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Enter num2:");
        num2Field = new JTextField();

        JLabel gcdLabel = new JLabel("GCD:");
        gcdField = new JTextField();
        gcdField.setEditable(false);

        gcdButton = new JButton("Calculate GCD");
        gcdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int gcd = calculateGCD(num1, num2);
                gcdField.setText(String.valueOf(gcd));
            }
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1Field.setText("");
                num2Field.setText("");
                gcdField.setText("");
            }
        });

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(gcdLabel);
        panel.add(gcdField);
        panel.add(gcdButton);
        panel.add(clearButton);

        add(panel, BorderLayout.CENTER);
        add(exitButton, BorderLayout.SOUTH);
    }

    private int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GCDCalculatorGUI().setVisible(true);
            }
        });
    }
}
