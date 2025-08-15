/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16303_ibrahimekinci_tut3_task1;

import impl.Bicycle;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Bicycle instance
        Bicycle bike = new Bicycle("Red", 15.5, 2, 21, 3, "Aluminum", 3, 7);

        // Print all attributes using toString
        System.out.println("Bicycle Details: " + bike);

        // Test individual getters
        System.out.println("Colour: " + bike.getColour());
        System.out.println("Actual Speed: " + bike.getActualSpeed());
        System.out.println("Number of Wheels: " + bike.getNumberWheels());
        System.out.println("Number of Gears: " + bike.getNumberGears());
        System.out.println("Actual Gear: " + bike.getActualGear());
        System.out.println("Frame Material: " + bike.getFrameMaterial());
        System.out.println("Number of Cogs (Front): " + bike.getNumberCogsFront());
        System.out.println("Number of Cogs (Back): " + bike.getNumberCogsBack());
    }

}
