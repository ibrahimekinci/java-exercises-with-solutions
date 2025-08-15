/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import core.Shape;
import util.Constants;

/**
 *
 * @author pc
 */
public class Circle implements Shape {

    // Radius of the circle
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Calculates diameter: 2 * radius
    @Override
    public double calculateDiameter() {
        return 2 * radius;
    }

    // Calculates circumference: 2 * PI * radius
    @Override
    public double calculateCircumference() {
        return 2 * Constants.PI * radius;
    }

    // Calculates area: PI * radius^2
    @Override
    public double calculateArea() {
        return Constants.PI * radius * radius;
    }

    // Returns string with all characteristics
    @Override
    public String showCharacteristics() {
        return "Circle [Radius=" + radius
                + ", Diameter=" + calculateDiameter()
                + ", Circumference=" + calculateCircumference()
                + ", Area=" + calculateArea() + "]";
    }
}
