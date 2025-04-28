import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1; // Use long to handle large results

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
