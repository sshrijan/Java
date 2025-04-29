public class constructorExample {
    String message;

    // Constructor
    public constructorExample(String msg) {
        message = msg;
        System.out.println("Message: "+ message);
    }

    // Method to display the message
    public void displayMessage(String msg) {
        message = msg;
        System.out.println("Message: " + message);
    }

    // Main method to run the program
    public static void main(String[] args) {
        constructorExample example = new constructorExample("Hello from constructor");
        example.displayMessage("Hello from method");
    }
}
