/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internal;

/**
 *
 * @author pc
 */
// Utility class for validating shape properties, made final to prevent inheritance
public final class ShapeValidator {

    // Private constructor to prevent instantiation
    private ShapeValidator() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    // Validates that a value is positive, throwing an exception if not
    public static void validatePositive(double value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be positive");
        }
    }
}
