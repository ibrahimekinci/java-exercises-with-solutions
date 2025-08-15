/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ait_16303_ibrahimekinci_tut2;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class InputDialogUtils {

    public static void showMessageDialog(String inputDialogMessage) {
        JOptionPane.showMessageDialog(null, inputDialogMessage);
    }

    public static int getIntWithoutBeingNullOrEmpty(String inputDialogMessage) {
        int inputInt = 0;
        boolean isFinished = false;
        String errorMsg = "";

        while (!isFinished) {
            String fullMessage = errorMsg + inputDialogMessage;
            String input = JOptionPane.showInputDialog(null, fullMessage, "", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                System.out.println("Cancel button has been clicked.");
                System.exit(0);
            }

            if (StringUtils.isEmpty(input)) {
                errorMsg = "The input cannot be empty.\n";
                continue;
            }

            try {
                inputInt = Integer.parseInt(input.trim());
                isFinished = true;
            } catch (NumberFormatException e) {
                errorMsg = "Invalid integer format.\n";
            }
        }

        return inputInt;
    }

    public static double getDoubleWithoutBeingNullOrEmpty(String inputDialogMessage) {
        double inputDouble = 0;
        boolean isFinished = false;
        String errorMsg = "";

        while (!isFinished) {
            String fullMessage = errorMsg + inputDialogMessage;
            String input = JOptionPane.showInputDialog(null, fullMessage, "", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                System.out.println("Cancel button has been clicked.");
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
                System.out.println("Cancel button has been clicked.");
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
