/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16303_ibrahimekinci_tut4_task1;

import domain.Circle;
import domain.Square;
import util.ColorConstants;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get the singleton instance of ShapeCalculator
        ShapeCalculator calculator = ShapeCalculator.getInstance();

        // Create a square and a circle with sample data
        Square square = new Square("Square1", ColorConstants.RED, 5.0);
        Circle circle = new Circle("Circle1", ColorConstants.BLUE, 3.0);

        // Calculate and print their details
        calculator.calculateAndPrintArea(square);
        calculator.calculateAndPrintArea(circle);
    }

}
