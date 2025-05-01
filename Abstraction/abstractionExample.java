package Abstraction;
// Abstract class to represent an operation
abstract class Operation {
    // Abstract method (no implementation here)
    public abstract int perform(int a, int b);
}

// Concrete class for addition
class Add extends Operation {
    @Override
    public int perform(int a, int b) {
        return a + b;  // Adds the numbers
    }
}

// Concrete class for subtraction
class Subtract extends Operation {
    @Override
    public int perform(int a, int b) {
        return a - b;  // Subtracts the numbers
    }
}

public class abstractionExample {
    public static void main(String[] args) {
        // Creating objects of specific operations
        Operation addOperation = new Add();  // Add is the specific implementation
        Operation subtractOperation = new Subtract();  // Subtract is the specific implementation

        // Using the perform method of each operation
        System.out.println("Addition of 5 and 3: " + addOperation.perform(5, 3));  // Outputs: 8
        System.out.println("Subtraction of 5 and 3: " + subtractOperation.perform(5, 3));  // Outputs: 2
    }
}
