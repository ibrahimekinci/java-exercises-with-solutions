/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ait_16303_ibrahimekinci_tut2;

/**
 *
 * Task4 Extend Java Program from Task1 that will ask user to input unit code,
 * f-Fahrenheit and c-Celsius, and then program convert the temperature into
 * another unit.
 */
public class Task4 {

    public static void main(String[] args) {
        String unit;
        while (true) {
            unit = InputDialogUtils.getStringWithoutBeingNullOrEmpty("Enter unit code (C for Celsius, F for Fahrenheit):");
            unit = unit.trim().toUpperCase();

            if (unit.equals("C") || unit.equals("F")) {
                break;
            } else {
                InputDialogUtils.showMessageDialog("Invalid unit. Please enter 'C' or 'F'.");
            }
        }

        double value = InputDialogUtils.getDoubleWithoutBeingNullOrEmpty("Enter the temperature value:");

        if (unit.equals("C")) {
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(value);
            InputDialogUtils.showMessageDialog(String.format("Temperature in Fahrenheit: %.2f°F", fahrenheit));
        } else {
            double celsius = TemperatureConverter.fahrenheitToCelsius(value);
            InputDialogUtils.showMessageDialog(String.format("Temperature in Celsius: %.2f°C", celsius));
        }
    }
}
