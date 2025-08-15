/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFrames;

import domain.CircleAreaCalculator;
import domain.ValidationResult;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pc
 */
public class CircleAreaCalculatorJFrame extends JFrame {

    private JTextField radiusField;
    private JLabel resultLabel;

    public CircleAreaCalculatorJFrame() {
        // Set up the frame
        setTitle("Circle Area Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen

        // Create main panel with padding
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title label
        JLabel titleLabel = new JLabel("Circle Area Calculator", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);

        // Radius input
        JLabel radiusLabel = new JLabel("Enter Radius:");
        radiusLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        mainPanel.add(radiusLabel, gbc);

        radiusField = new JTextField(10);
        radiusField.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(radiusField, gbc);

        // Calculate button
        JButton calculateButton = new JButton("Calculate Area");
        calculateButton.setFont(new Font("Arial", Font.PLAIN, 14));
        calculateButton.setBackground(new Color(66, 165, 245));
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        mainPanel.add(calculateButton, gbc);

        // Result label
        resultLabel = new JLabel("Area will be displayed here", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        mainPanel.add(resultLabel, gbc);

        // Add action listener for the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });

        // Add main panel to frame
        add(mainPanel);

        // Allow pressing Enter in the text field to calculate
        radiusField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        var circleAreaCalculator = new CircleAreaCalculator(radiusField.getText());
        ValidationResult vr = circleAreaCalculator.Validate();
        if (vr.isSuccess()) {
            resultLabel.setText(String.format("Area: %.2f square units", circleAreaCalculator.calculateArea()));
        } else {
            resultLabel.setText(vr.getMessage());
        }
    }
}
