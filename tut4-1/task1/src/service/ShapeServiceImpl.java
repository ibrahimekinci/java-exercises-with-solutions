/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Poly;

/**
 *
 * @author pc
 */
// Implementation of ShapeService to handle shape-related operations
public class ShapeServiceImpl implements ShapeService {

    // Computes the area by delegating to the shape's calculateArea method
    @Override
    public double computeArea(Poly shape) {
        // Check for null to prevent errors
        if (shape == null) {
            throw new IllegalArgumentException("Shape cannot be null");
        }
        return shape.calculateArea();
    }

    // Formats and returns details of the shape, including name, color, and area
    @Override
    public String getShapeDetails(Poly shape) {
        // Ensure the shape is not null before processing
        if (shape == null) {
            throw new IllegalArgumentException("Shape cannot be null");
        }
        // Format the area directly, removing the need for an inner class
        return String.format("Shape: %s, Colour: %s, Area: %.2f",
                shape.getName(), shape.getColour(), computeArea(shape));
    }
}
