/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ait_16303_ibrahimekinci_tut2;

/**
 *
 * Task3 Write a Java Program that will ask the question if you are an
 * Australian citizen. If you enter “YES” the program will ask your age. If you
 * are 16 year old the program will display a message saying that you can apply
 * for driving license. However if you are not an Australian citizen or if you
 * are less than 16 year old the message will be that you cannot apply for a
 * driving license.
 */
public class Task3 {

    public static void main(String[] args) {
        String responseMessage;
        String citizenship;

        while (true) {
            citizenship = InputDialogUtils.getStringWithoutBeingNullOrEmpty("Are you an Australian citizen? (YES/NO)").trim().toUpperCase();
            if (!citizenship.equalsIgnoreCase("YES") && !citizenship.equalsIgnoreCase("NO")) {
                InputDialogUtils.showMessageDialog("Please enter a valid input! (YES/NO)");
            } else {
                break;
            }
        }

        if (citizenship.equalsIgnoreCase("NO")) {
            responseMessage = "You cannot apply for a driving license.";
        } else {
            double age;
            while (true) {
                age = InputDialogUtils.getIntWithoutBeingNullOrEmpty("Enter your age:");
                if (age <= 0 || age > 120) {
                    InputDialogUtils.showMessageDialog("Please enter a valid age between 1 and 120.");
                } else {
                    break;
                }
            }

            if (age >= 16) {
                responseMessage = "You can apply for a driving license.";
            } else {
                responseMessage = "You cannot apply for a driving license.";
            }
        }

        InputDialogUtils.showMessageDialog(responseMessage);
    }
}
