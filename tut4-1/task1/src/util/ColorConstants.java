/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author pc
 */
// Utility class to store color constants, made final to prevent inheritance
public final class ColorConstants {

    // Private constructor to prevent instantiation of this utility class
    private ColorConstants() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    // Common color constants for use in the application
    public static final String RED = "Red";
    public static final String BLUE = "Blue";
    public static final String GREEN = "Green";
}
