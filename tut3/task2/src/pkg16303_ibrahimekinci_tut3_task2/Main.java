/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16303_ibrahimekinci_tut3_task2;

import impl.Motorcycle;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n--- Testing Motorcycle ---");

        // Create a Motorcycle instance
        Motorcycle motorcycle = new Motorcycle("Black", 60.0, 2, 500.0, false);
        System.out.println("Motorcycle Details: " + motorcycle);
        System.out.println("Colour: " + motorcycle.getColour());
        System.out.println("Actual Speed: " + motorcycle.getActualSpeed());
        System.out.println("Number of Wheels: " + motorcycle.getNumberWheels());
        System.out.println("Engine Size: " + motorcycle.getEngineSize() + "cc");
    }

}
