/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author pc
 */
// This abstract class defines the blueprint for all shapes, ensuring they have a name, color, and area calculation method.
public abstract class Poly {

    // Private final fields to ensure immutability of name and color after creation
    private final String name;
    private final String colour;

    // Constructor to initialize the shape's name and color
    protected Poly(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    // Abstract method that forces subclasses to implement their own area calculation logic
    public abstract double calculateArea();

    // Getter for name, keeping it read-only to maintain encapsulation
    public String getName() {
        return name;
    }

    // Getter for colour, ensuring the field remains immutable externally
    public String getColour() {
        return colour;
    }
}
