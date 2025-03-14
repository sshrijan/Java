public class ToLowerCase{
    public static void main(String[] args) {
        String str = "HELLO world";
        String lowerCaseString = str.toLowerCase().trim();
        String upperCaseString = str.toUpperCase();
        String trimmedString = upperCaseString.trim();
        int length = str.length();

        System.out.println("Original String : "+ str);
        System.out.println("LoweredCase String : "+ lowerCaseString);
        System.out.println("UpperCase String : "+ upperCaseString);
        System.out.println("Trimmed String : "+ trimmedString);
        System.out.println("Length Of String : "+ length);
        
    }
}