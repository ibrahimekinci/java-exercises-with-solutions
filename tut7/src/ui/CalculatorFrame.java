package ui;

import application.CalculatorService;
import shared.exceptions.CalculationException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public final class CalculatorFrame extends JFrame {

    private final JTextField txtNum1 = new JTextField(8);
    private final JTextField txtNum2 = new JTextField(8);
    private final JTextField txtResult = new JTextField(15);

    private final CalculatorService calculatorService = new CalculatorService();

    public CalculatorFrame() {
        setTitle("Java Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/apple-icon-57x57.png"));
        setIconImage(icon.getImage());
        
        txtResult.setEditable(false);

        add(new JLabel("Number 1:"));
        add(txtNum1);
        add(Box.createVerticalStrut(10));
        add(new JLabel("Number 2:"));
        add(txtNum2);
        add(Box.createVerticalStrut(10));
        add(new JLabel("Result:"));
        add(txtResult);
        add(Box.createVerticalStrut(10));
        addButton("Add", e -> calculate("add"));
        addButton("Subtract", e -> calculate("subtract"));
        addButton("Multiply", e -> calculate("multiply"));
        addButton("Divide", e -> calculate("divide"));
        addButton("Clear", e -> clearFields());
        addButton("Exit", e -> System.exit(0));

        setVisible(true);
    }

    private void addButton(String label, ActionListener listener) {
        JButton btn = new JButton(label);
        btn.addActionListener(listener);
        add(btn);
    }

    private void calculate(String operation) {
        try {
            double a = Double.parseDouble(txtNum1.getText());
            double b = Double.parseDouble(txtNum2.getText());
            double result = switch (operation) {
                case "add" ->
                    calculatorService.add(a, b);
                case "subtract" ->
                    calculatorService.subtract(a, b);
                case "multiply" ->
                    calculatorService.multiply(a, b);
                case "divide" ->
                    calculatorService.divide(a, b);
                default ->
                    throw new IllegalArgumentException("Unknown operation");
            };
            txtResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            showError("Invalid number input.");
        } catch (CalculationException ex) {
            showError(ex.getMessage());
        } catch (Exception ex) {
            showError("Unexpected error, please try again.");
        }
    }

    private void clearFields() {
        txtNum1.setText("");
        txtNum2.setText("");
        txtResult.setText("");
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Calculation Error", JOptionPane.ERROR_MESSAGE);
    }
}
