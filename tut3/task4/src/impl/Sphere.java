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
public class Sphere extends Circle {

    // Material of the sphere (Plastic, Metal)
    private final String material;

    public Sphere(double radius, String material) {
        super(radius);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    // Calculates diameter (same as Circle)
    @Override
    public double calculateDiameter() {
        return super.calculateDiameter();
    }

    // Calculates circumference
    @Override
    public double calculateCircumference() {
        return super.calculateCircumference();
    }

    // Calculates surface area
    @Override
    public double calculateArea() {
        return 4 * Constants.PI * getRadius() * getRadius();
    }

    // Returns string with all characteristics
    @Override
    public String showCharacteristics() {
        return "Sphere [Radius=" + getRadius() + ", Material=" + material
                + ", Diameter=" + calculateDiameter()
                + ", Great Circle Circumference=" + calculateCircumference()
                + ", Surface Area=" + calculateArea() + "]";
    }
}
