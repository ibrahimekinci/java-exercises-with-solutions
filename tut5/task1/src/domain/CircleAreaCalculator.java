/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author pc
 */
public class CircleAreaCalculator {

    private final String radiusString;
    double radius;

    public CircleAreaCalculator(String radiusString) {
        this.radius = 0;
        this.radiusString = radiusString.trim();
    }

    public ValidationResult Validate() {
        ValidationResult vr;
        try {
            // Get radius from text field
            radius = Double.parseDouble(radiusString);
            if (radius < 0) {
                vr = new ValidationResult(false, "Radius cannot be negative");
            } else {
                {
                    vr = new ValidationResult(true, "");
                }
            }
        } catch (NumberFormatException ex) {
            vr = new ValidationResult(false, "Please enter a valid number");
        } catch (Exception ex) {
            vr = new ValidationResult(false, "Internal error, please try later!");
        }
        return vr;
    }

    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
