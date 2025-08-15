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
// Square class inherits from Poly to represent a square shape with a side length
public class Square extends Poly {

    // Side length of the square, made final to prevent modification
    private final double side;

    // Constructor initializes name, color, and side, with validation
    public Square(String name, String colour, double side) {
        super(name, colour);
        // Validate that the side length is positive to avoid invalid shapes
        ShapeValidator.validatePositive(side, "Side length");
        this.side = side;
    }

    // Implements the area calculation for a square (side * side)
    @Override
    public double calculateArea() {
        return side * side;
    }

    // Getter for side length, maintaining encapsulation
    public double getSide() {
        return side;
    }
}
