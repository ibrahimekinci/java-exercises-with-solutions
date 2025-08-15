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
// Interface defining the contract for shape-related business logic
public interface ShapeService {
    // Computes the area of a given shape
    double computeArea(Poly shape);

    // Returns a formatted string with shape details (name, color, area)
    String getShapeDetails(Poly shape);
}
