/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16303_ibrahimekinci_tut3_task4;

import impl.Circle;
import impl.Cylinder;
import impl.Sphere;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create a Circle with radius 15.5
        Circle circle = new Circle(15.5);
        System.out.println(circle.showCharacteristics());

        // Create a Cylinder with radius 15.5 and height 10.0
        Cylinder cylinder = new Cylinder(15.5, 10.0);
        System.out.println("\n" + cylinder.showCharacteristics());

        // Create a Sphere with radius 15.5 and material Plastic
        Sphere sphere = new Sphere(15.5, "Plastic");
        System.out.println("\n" + sphere.showCharacteristics());
    }
    
}
