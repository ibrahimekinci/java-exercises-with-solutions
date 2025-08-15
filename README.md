# Java Programming Exercises

This repository contains a collection of **Java programming exercises** designed to build a strong foundation in Java development.  
The exercises progress from basic input/output operations to more advanced topics such as GUI development, event handling, and exception management.

Each tutorial is organized into its own folder (e.g., `Tutorial01`, `Tutorial02`, …), containing the complete source code for the tasks.

---

## 📚 Tutorials Overview

### **Tutorial 01 – Basic Input/Output with `JOptionPane`**
1. Prompt the user for two numbers and display their sum.
2. Request the user's first and last names separately, then display the full name.
3. Accept three numbers as input, then calculate and display their average.

---

### **Tutorial 02 – Expressions and Control Structures**
1. Convert a temperature from Fahrenheit to Celsius based on user input.
2. Determine and display a grade (e.g., FAIL, PASS, CREDIT) based on an entered exam mark.
3. Check eligibility for a driving license based on citizenship and age.
4. Extend the temperature converter to handle both Fahrenheit ↔ Celsius conversions.

---

### **Tutorial 03 – Classes and Inheritance**
1. Implement a `Vehicle` base class, a `LandVehicle` subclass, and a `Bicycle` class with attributes like color, speed, gears, wheels, and material.
2. Add another subclass of `LandVehicle` (e.g., Car, Truck) with unique attributes.
3. Create a `Circle` class with methods for diameter, circumference, area, and displaying characteristics.
4. Extend with `Cylinder` and `Sphere` classes inheriting from `Circle`, adding height or volume calculations.

---

### **Tutorial 04 – Interfaces and Packages**
1. Define an abstract class `Poly` with an area calculation method, then implement in `Square` and `Circle` subclasses.
2. Create interfaces:
   - `Shape2D` – diameter, circumference, area, characteristics
   - `Shape3D` – volume calculation  
   Implement in classes such as `Circle`, `Sphere`, `Square`, `Rectangle`, and `Cylinder`.

---

### **Tutorial 05 – GUI Basics**
1. Create a `JFrame` application that calculates a circle’s area from a radius input.
2. Use `JPanel` and `JFrame` to draw shapes or graphics with custom colors.
3. (Bonus) Create custom artwork using Java 2D drawing.

---

### **Tutorial 06 – Event Handling**
- Build a drawing game **DrawSomething** using `JPanel` and `JFrame`:
  - Mouse drawing
  - Color selection: Red (`r`), Green (`g`), Cyan (`c`), Yellow (`y`), Black (`b`)
  - Eraser: (`e`)
  - Brush size: `+` / `-`
  - Implements `MouseListener` and `KeyListener`

---

### **Tutorial 07 – Advanced GUI**
- Build a calculator application using `JFrame` with:
  - Buttons for `+`, `-`, `×`, `÷`, Clear, and Exit
  - Text fields for input
  - Event handling for button clicks

---

### **Tutorial 08 – Exception Handling**
1. Analyze the legality of a `try-finally` block without `catch`.
2. Create an `Account` class with a `withdraw` method that throws a custom `InsufficientFundsException`.

---

## 🚀 How to Run
- Developed with **Apache NetBeans IDE**.
- Each folder contains its own `.java` source files.
- To run:
  ```bash
  javac *.java
  java MainClass
