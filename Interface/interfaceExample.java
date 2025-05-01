package Interface;

interface walkable {
    void walk();
}
interface swimmable {
    void swim();
}
class human implements walkable, swimmable {
    public void walk() {
        System.out.println("Human is walking");
    }
    public void swim() {
        System.out.println("Human is swimming");
    }
}

public class interfaceExample {
    public static void main(String[] args) {
        human h = new human();
        h.walk();
        h.swim();
    }
}

