// Package declaration (optional depending on project structure)
package Polymorphism;

// Base class Shape
class Shape {
    // Method to draw a general shape
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Circle class that inherits from Shape and overrides draw()
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Square class that inherits from Shape and overrides draw()
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// Main class to demonstrate method overriding using polymorphism
public class overridingExample {
    public static void main(String[] args) {
        // Declare a Shape reference and assign it to a Circle object
        Shape s1 = new Circle();  // Polymorphism: s1 is a Shape, but holds a Circle object
        s1.draw();  // Calls Circle's draw method -> Output: Drawing a circle

        // Reassign the same Shape reference to a Square object
        s1 = new Square();  // Now s1 refers to a Square object
        s1.draw();  // Calls Square's draw method -> Output: Drawing a square
    }
}
