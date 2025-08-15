/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core;

/**
 *
 * @author pc
 */
public interface Shape {
    // Calculates the diameter of the shape
    double calculateDiameter();
    
    // Calculates the circumference of the shape
    double calculateCircumference();
    
    // Calculates the area of the shape
    double calculateArea();
    
    // Returns a string with the shape's characteristics
    String showCharacteristics();
}
