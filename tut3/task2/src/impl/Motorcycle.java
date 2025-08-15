/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

/**
 *
 * @author pc
 */
public class Motorcycle extends LandVehicle {

    // Engine size in cubic centimeters (cc)
    private double engineSize;

    // Constructor to initialize all attributes
    public Motorcycle(String colour, double actualSpeed, int numberWheels,
            double engineSize, boolean hasSidecar) {
        super(colour, actualSpeed, numberWheels);
        this.engineSize = engineSize;
    }

    // Getter for engineSize
    public double getEngineSize() {
        return engineSize;
    }
}
