/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg16303_ibrahimekinci_tut4_task1;

import domain.Poly;
import service.ShapeService;
import service.ShapeServiceImpl;

/**
 *
 * @author pc
 */
// Singleton class to manage shape calculations centrally
public final class ShapeCalculator {
    // Single instance of ShapeCalculator
    private static final ShapeCalculator INSTANCE = new ShapeCalculator();
    // Reference to the shape service for business logic
    private final ShapeService shapeService;

    // Private constructor to initialize the service and enforce singleton pattern
    private ShapeCalculator() {
        this.shapeService = new ShapeServiceImpl();
    }

    // Returns the singleton instance
    public static ShapeCalculator getInstance() {
        return INSTANCE;
    }

    // Calculates and prints shape details using the service
    public void calculateAndPrintArea(Poly shape) {
        System.out.println(shapeService.getShapeDetails(shape));
    }
}
