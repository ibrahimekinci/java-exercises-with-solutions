/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ait_16303_ibrahimekinci_tut2;

/**
 *
 * Task1 Write a simple Java Program (An application) using JOPtionPane of Java
 * Swing package that will ask you to enter a temperature in Fahrenheit. Then
 * the program converts the temperature into Celsius as follows C÷5 = (F-32) ÷ 9
 * Where C is the temperature in Celsius and F stands for Fahrenheit
 */
public class Task1 {

    public static void main(String[] args) {
        double celsiusTemperature = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Please enter a temperature in Celsius");
        double fahrenheitTemperature = TemperatureConverter.celsiusToFahrenheit(celsiusTemperature);
        String inputDialogMessage = String.format("The given Celsius temperature equals %.2f in Fahrenheit.", fahrenheitTemperature);
        InputDialogUtils.showMessageDialog(inputDialogMessage);
    }
}
