import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculatorGUI extends JFrame {
    private JTextField inputField, resultField;

    public FactorialCalculatorGUI() {
        setTitle("Factorial Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));

        JLabel inputLabel = new JLabel("Enter the number:");
        inputField = new JTextField();

        JLabel resultLabel = new JLabel("Factorial value is:");
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    long factorial = calculateFactorial(number);
                    resultField.setText(String.valueOf(factorial));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);
        panel.add(resultField);

        add(panel);
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FactorialCalculatorGUI().setVisible(true);
            }
        });
    }
}
