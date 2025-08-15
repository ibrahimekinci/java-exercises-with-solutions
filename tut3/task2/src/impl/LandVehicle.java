/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import core.Vehicle;

/**
 *
 * @author pc
 */
public abstract class LandVehicle implements Vehicle {

    // Color of the vehicle
    protected String colour;

    // Current speed in km/h
    protected double actualSpeed;

    // Number of wheels
    protected int numberWheels;

    // Constructor to initialize common attributes
    public LandVehicle(String colour, double actualSpeed, int numberWheels) {
        this.colour = colour;
        this.actualSpeed = actualSpeed;
        this.numberWheels = numberWheels;
    }

    // Getter for colour
    @Override
    public String getColour() {
        return colour;
    }

    // Getter for actualSpeed
    @Override
    public double getActualSpeed() {
        return actualSpeed;
    }

    // Getter for numberWheels
    public int getNumberWheels() {
        return numberWheels;
    }
}
