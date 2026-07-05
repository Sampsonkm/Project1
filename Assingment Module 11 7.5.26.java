import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniCalculator extends JFrame implements ActionListener {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;

    public MiniCalculator() {
        setTitle("Mini Calculator");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center window

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 5, 5));

        // First number
        panel.add(new JLabel("Enter First Number:"));
        firstNumberField = new JTextField();
        panel.add(firstNumberField);

        // Second number
        panel.add(new JLabel("Enter Second Number:"));
        secondNumberField = new JTextField();
        panel.add(secondNumberField);

        // Buttons
        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("x");
        JButton divBtn = new JButton("/");
        JButton remBtn = new JButton("Rem");

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        remBtn.addActionListener(this);

        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(mulBtn);
        panel.add(divBtn);
        panel.add(remBtn);

        // Result
        panel.add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setForeground(Color.BLUE);
        panel.add(resultField);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double result = 0;

            String command = e.getActionCommand();

            switch (command) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "x":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "Rem":
                    result = num1 % num2;
                    break;
            }

            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new MiniCalculator();
    }
}
