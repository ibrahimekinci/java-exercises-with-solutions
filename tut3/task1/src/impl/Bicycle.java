/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

/**
 *
 * @author pc
 */
public class Bicycle extends LandVehicle {
    // Total number of gears
    private int numberGears;
    
    // Current gear
    private int actualGear;
    
    // Material of the bicycle frame (e.g., Aluminum, Carbon)
    private String frameMaterial;
    
    // Number of cogs on the front chainring
    private int numberCogsFront;
    
    // Number of cogs on the rear cassette
    private int numberCogsBack;

    // Constructor to initialize all attributes
    public Bicycle(String colour, double actualSpeed, int numberWheels, int numberGears, 
                   int actualGear, String frameMaterial, int numberCogsFront, int numberCogsBack) {
        super(colour, actualSpeed, numberWheels);
        this.numberGears = numberGears;
        this.actualGear = actualGear;
        this.frameMaterial = frameMaterial;
        this.numberCogsFront = numberCogsFront;
        this.numberCogsBack = numberCogsBack;
    }

    // Getter for numberGears
    public int getNumberGears() {
        return numberGears;
    }

    // Getter for actualGear
    public int getActualGear() {
        return actualGear;
    }

    // Getter for frameMaterial
    public String getFrameMaterial() {
        return frameMaterial;
    }

    // Getter for numberCogsFront
    public int getNumberCogsFront() {
        return numberCogsFront;
    }

    // Getter for numberCogsBack
    public int getNumberCogsBack() {
        return numberCogsBack;
    }

    // Returns a string representation of the Bicycle
    @Override
    public String toString() {
        return "Bicycle [colour=" + colour + ", actualSpeed=" + actualSpeed + 
               ", numberWheels=" + numberWheels + ", numberGears=" + numberGears + 
               ", actualGear=" + actualGear + ", frameMaterial=" + frameMaterial + 
               ", numberCogsFront=" + numberCogsFront + ", numberCogsBack=" + numberCogsBack + "]";
    }
}
