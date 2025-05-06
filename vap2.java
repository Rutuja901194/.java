
    import java.util.Scanner;

    public class vap2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Apply string methods
        System.out.println("\n--- String Methods Output ---");
        System.out.println("Original string: " + input);
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        if (input.length() >= 1) {
            System.out.println("First character: " + input.charAt(0));
        }

        if (input.length() >= 5) {
            System.out.println("Substring (0 to 5): " + input.substring(0, 5));
        }

        System.out.println("Contains 'java': " + input.contains("java"));
        System.out.println("Replace 'a' with '@': " + input.replace('a', '@'));

        scanner.close();
    }
}


