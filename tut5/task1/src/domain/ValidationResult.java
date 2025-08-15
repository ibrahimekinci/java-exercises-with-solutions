/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author pc
 */
public class ValidationResult {

    private final boolean success;
    private final String message;

    // Constructor
    public ValidationResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Static factory methods for convenience
    public static ValidationResult success(String message) {
        return new ValidationResult(true, message);
    }

    public static ValidationResult failure(String message) {
        return new ValidationResult(false, message);
    }

    // Getters
    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    // Optional: toString override for debugging
    @Override
    public String toString() {
        return (success ? "SUCCESS: " : "FAILURE: ") + message;
    }
}
