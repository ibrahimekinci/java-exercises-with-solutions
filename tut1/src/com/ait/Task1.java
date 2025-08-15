/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ait;

/**
 * Write a simple Java Program (An application) using JOPtionPane object of Java
 * Swing package that Use input dialogs to input two values from user Use
 * message dialog to display sum of the two values
 */
//16303_IbrahimEkinci_tut1_task1
public class Task1 {

    public static void main(String[] args) {
        double num1 = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Enter first number: ");
        double num2 = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Enter second number: ");
        double sum = num1 + num2;
        String responsePrint = String.format("Sum: %.2f", sum);
        InputDialogUtils.showMessageDialog(responsePrint);
    }

}
