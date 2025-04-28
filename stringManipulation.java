public class stringManipulation {
    public static void main(String[] args) {
        String str = "    HELLO world";
        String lowerCaseString = str.toLowerCase();
        String upperCaseString = str.toUpperCase().trim();
        String trimmedString = str.trim();
        int length = str.length();

        System.out.println("Original String : "+ str);
        System.out.println("LoweredCase String : "+ lowerCaseString);
        System.out.println("UpperCase String : "+ upperCaseString);
        System.out.println("Trimmed String : "+ trimmedString);
        System.out.println("Length Of String : "+ length);

    }
}