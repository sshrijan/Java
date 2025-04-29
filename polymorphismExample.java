class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class polymorphismExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();  // Circle object as Shape
        s1.draw();  // Outputs: Drawing a circle

         s1 = new Square();  // Square object as Shape
        s1.draw();  // Outputs: Drawing a square
    }
}
