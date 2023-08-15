import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiNumberCalculatorGUI extends JFrame {
    private JTextField displayField;
    private StringBuilder currentInput = new StringBuilder();
    private double result = 0;
    private char operator = ' ';

    public MultiNumberCalculatorGUI() {
        setTitle("Multi-Number Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 4, 10, 10));

        displayField = new JTextField();
        displayField.setEditable(false);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        add(displayField, BorderLayout.NORTH);
        add(panel);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("0123456789".contains(command)) {
                currentInput.append(command);
                displayField.setText(currentInput.toString());
            } else if ("+-*/%".contains(command)) {
                if (currentInput.length() > 0) {
                    double num = Double.parseDouble(currentInput.toString());
                    performPendingCalculation(num);
                    operator = command.charAt(0);
                    currentInput.setLength(0);
                }
            } else if ("=".equals(command)) {
                if (currentInput.length() > 0) {
                    double num = Double.parseDouble(currentInput.toString());
                    performPendingCalculation(num);
                    displayField.setText(String.valueOf(result));
                    currentInput.setLength(0);
                    result = 0;
                    operator = ' ';
                }
            } else if ("C".equals(command)) {
                currentInput.setLength(0);
                result = 0;
                operator = ' ';
                displayField.setText("");
            }
        }
    }

    private void performPendingCalculation(double num) {
        switch (operator) {
            case '+':
                result += num;
                break;
            case '-':
                result -= num;
                break;
            case '*':
                result *= num;
                break;
            case '/':
                result /= num;
                break;
            case '%':
                result %= num;
                break;
            default:
                result = num;
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MultiNumberCalculatorGUI().setVisible(true);
            }
        });
    }
}
