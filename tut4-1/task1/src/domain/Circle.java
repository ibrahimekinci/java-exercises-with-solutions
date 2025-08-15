/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import internal.ShapeValidator;

/**
 *
 * @author pc
 */
// Circle class inherits from Poly to represent a circle with a radius
public class Circle extends Poly {

    // Radius of the circle, made final for immutability
    private final double radius;

    // Constructor sets name, color, and radius with validation
    public Circle(String name, String colour, double radius) {
        super(name, colour);
        // Ensure the radius is positive to create a valid circle
        ShapeValidator.validatePositive(radius, "Radius");
        this.radius = radius;
    }

    // Implements the area calculation for a circle (pi * radius^2)
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Getter for radius to allow access while keeping it read-only
    public double getRadius() {
        return radius;
    }
}
