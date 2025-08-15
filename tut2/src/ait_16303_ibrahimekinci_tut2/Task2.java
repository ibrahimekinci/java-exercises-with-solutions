/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ait_16303_ibrahimekinci_tut2;

/**
 *
 * Task2 Write a simple Java Program (an application) that will ask your Exam
 * marks to be entered in JOptionPane. The program then shows your Grade for the
 * exam as follows ￿ <50 FAIL ￿ Between 50 and 64 is PASS ￿ Between 65 and 74 is
 * CREDIT ￿ Between 75 and 84 is DISTINCTION ￿ Any number above 84 is HIGH
 * DISTINCTION
 */
public class Task2 {

    public static void main(String[] args) {
        double marks;
        while (true) {
            marks = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Enter your exam marks (0–100):");
            if (marks < 0 || marks > 100) {
                InputDialogUtils.showMessageDialog("Marks must be between 0 and 100.");
            } else {
                break;
            }
        }

        String grade;
        if (marks < 50) {
            grade = "FAIL";
        } else if (marks <= 64) {
            grade = "PASS";
        } else if (marks <= 74) {
            grade = "CREDIT";
        } else if (marks <= 84) {
            grade = "DISTINCTION";
        } else {
            grade = "HIGH DISTINCTION";
        }

        InputDialogUtils.showMessageDialog("Your grade is: " + grade);
    }
}
