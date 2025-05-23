class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor(String color) {
        System.out.println(color); // prints color of Dog method class
        System.out.println(this.color); // prints color of Dog class
        System.out.println(super.color); // prints color of Animal class
    }
}

public class SuperExample {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor("purple");
    }
}
