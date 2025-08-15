/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ait_16303_ibrahimekinci_tut2;

/**
 *
 * @author pc
 */
public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsiusTemperature) {
        double fahrenheitTemperature = (9.0 / 5.0) * celsiusTemperature + 32;
        return fahrenheitTemperature;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        double celsiusTemperature = (fahrenheitTemperature - 32) * 5.0 / 9.0;
        return celsiusTemperature;
    }
}
