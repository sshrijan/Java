public class encapsulationExample {
    // Private variables
    private String name;
    private int age;

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Main method inside the same class
    public static void main(String[] args) {
        encapsulationExample p = new encapsulationExample();

        p.setName("sshree");
        p.setAge(19);

        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
    }
}
