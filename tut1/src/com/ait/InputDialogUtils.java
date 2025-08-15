/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ait;

import javax.swing.JOptionPane;

/**
 *
 * 16303_IbrahimEkinci_tut1
 */
public class InputDialogUtils {

    public static void showMessageDialog(String inputDialogMessage) {
        JOptionPane.showMessageDialog(null, inputDialogMessage);
    }

    public static double getDoubleWithoutBeingNullOrEmpty(String inputDialogMessage) {
        double inputDouble = 0;
        boolean isFinished = false;
        String errorMsg = "";

        while (!isFinished) {
            String fullMessage = errorMsg + inputDialogMessage;
            String input = JOptionPane.showInputDialog(null, fullMessage, "", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                System.exit(0);
            }

            if (StringUtils.isEmpty(input)) {
                errorMsg = "The input cannot be empty.\n";
                continue;
            }

            try {
                inputDouble = Double.parseDouble(input.trim());
                isFinished = true;
            } catch (NumberFormatException e) {
                errorMsg = "Invalid number format.\n";
            }
        }

        return inputDouble;
    }

    public static String getStringWithoutBeingNullOrEmpty(String inputDialogMessage) {
        String response = "";

        boolean isFinished = false;
        String errorMsg = "";

        while (!isFinished) {
            String fullMessage = errorMsg + inputDialogMessage;
            String input = JOptionPane.showInputDialog(null, fullMessage, "", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                System.exit(0);
            }

            if (StringUtils.isEmpty(input)) {
                errorMsg = "The input cannot be empty.\n";
                continue;
            }

            response = input;
            isFinished = true;
        }

        return response;
    }
}
