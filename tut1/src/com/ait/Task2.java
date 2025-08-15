/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ait;

/**
 * Write a simple Java Program (An application) using JOPtionPane object of Java
 * Swing package that will ask you to enter your first name Then it will ask you
 * to enter your family name At the end the program will show your full name in
 * JOption output pane
 */
//16303_IbrahimEkinci_tut1_task2
public class Task2 {

    public static void main(String[] args) {
        String firstName = InputDialogUtils.getStringWithoutBeingNullOrEmpty("Enter your first name:");
        String lastName = InputDialogUtils.getStringWithoutBeingNullOrEmpty("Enter your family name:");
        String responsePrint = String.join(" ", "Your full name is:", firstName.trim(), lastName.trim());
        InputDialogUtils.showMessageDialog(responsePrint);
    }
}
