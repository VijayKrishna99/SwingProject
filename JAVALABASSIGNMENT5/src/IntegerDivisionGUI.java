import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionGUI extends JFrame {
    private JTextField num1Field, num2Field, resultField;

    public IntegerDivisionGUI() {
        setTitle("Integer Division Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(IntegerDivisionGUI.this,
                            "Invalid input. Please enter valid integers.",
                            "Number Format Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(IntegerDivisionGUI.this,
                            "Division by zero is not allowed.",
                            "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(divideButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new IntegerDivisionGUI().setVisible(true);
            }
        });
    }
}
