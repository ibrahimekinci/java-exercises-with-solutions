/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import util.Constants;

/**
 *
 * @author pc
 */
public class Cylinder extends Circle {

    // Height of the cylinder
    private final double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Calculates diameter (same as Circle)
    @Override
    public double calculateDiameter() {
        return super.calculateDiameter();
    }

    // Calculates circumference (same as Circle, assuming circumference of the base)
    @Override
    public double calculateCircumference() {
        return super.calculateCircumference();
    }

    // Calculates total surface area: 2πr² (two bases) + 2πrh (lateral surface)
    @Override
    public double calculateArea() {
        return 2 * Constants.PI * getRadius() * getRadius()
                + 2 * Constants.PI * getRadius() * height;
    }

    // Returns string with all characteristics
    @Override
    public String showCharacteristics() {
        return "Cylinder [Radius=" + getRadius() + ", Height=" + height
                + ", Diameter=" + calculateDiameter()
                + ", Base Circumference=" + calculateCircumference()
                + ", Surface Area=" + calculateArea() + "]";
    }
}
