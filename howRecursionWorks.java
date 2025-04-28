public class howRecursionWorks {
    public static void main(String[] args) {
        int number = 4;
        int result = fact(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int fact(int n) {
        System.out.println("Calling factorial( " + n + " )");
        if (n == 1) {
            System.out.println("Base case reached. Returning 1");
            return 1;
        } else {
            int result = n * fact(n - 1);
            System.out.println("Returning " + result + " for factorial(" + n + ")");
            return result;

        }
    }
}
