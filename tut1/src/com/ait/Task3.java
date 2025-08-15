/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ait;

/**
 *
 * Write a simple Java Program using JOPtionPane object of Java Swing package
 * that will ask you to enter three numbers Then the program will show you the
 * average of those three numbers you have entered
 */
//16303_IbrahimEkinci_tut1_task3
public class Task3 {

    public static void main(String[] args) {

        double num1 = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Enter first number: ");
        double num2 = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Enter second number: ");
        double num3 = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Enter third number: ");

        double average = (num1 + num2 + num3) / 3.0;

        String responsePrint = String.format("Average: %.2f", average);
        InputDialogUtils.showMessageDialog(responsePrint);
    }
}
