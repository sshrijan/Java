package Polymorphism;

class Calculator {
    // Method with 2 int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters (overloaded)
    public double add(double a, double b) {
        return a + b;
    }
}

public class overloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));          // Calls int add(int, int)
        System.out.println(calc.add(2, 3, 4));       // Calls int add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));      // Calls double add(double, double)
    }
}
