
    import java.util.Scanner;

    public class vap4 {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a character from the user
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);  // Read first character of input

        System.out.println("\n--- Character Method Checks ---");
        System.out.println("You entered: " + ch);

        // Check if it's a letter
        if (Character.isLetter(ch)) {
            System.out.println("It is a letter.");
        } else {
            System.out.println("It is not a letter.");
        }

        // Check if it's a digit
        if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is not a digit.");
        }

        // Check if it's whitespace
        if (Character.isWhitespace(ch)) {
            System.out.println("It is a whitespace character.");
        } else {
            System.out.println("It is not a whitespace character.");
        }

        // Check if it's uppercase
        if (Character.isUpperCase(ch)) {
            System.out.println("It is an uppercase letter.");
        } else {
            System.out.println("It is not an uppercase letter.");
        }

        // Check if it's lowercase
        if (Character.isLowerCase(ch)) {
            System.out.println("It is a lowercase letter.");
        } else {
            System.out.println("It is not a lowercase letter.");
        }

        scanner.close();
    }
}

