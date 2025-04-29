class Calculator {
    // Method Overloading: same name, different parameters

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // This method will be overridden
    public void showType() {
        System.out.println("I am a generic calculator");
    }
}

// Subclass that overrides a method
class ScientificCalculator extends Calculator {
    @Override
    public void showType() {
        System.out.println("I am a scientific calculator");
    }
}

public class polymorphismCombinedExample {
    public static void main(String[] args) {
        // Method Overloading examples
        Calculator calc = new Calculator();
        System.out.println("Add 2 ints: " + calc.add(5, 3));
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.5));
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));

        // Method Overriding example
        Calculator sc = new ScientificCalculator(); // Using base class reference
        sc.showType();  // Outputs: I am a scientific calculator
    }
}
