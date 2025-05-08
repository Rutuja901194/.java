
    import java.util.Scanner;

    public class vap3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Apply various string methods
        System.out.println("\n--- String Method Operations ---");

        // 1. Length of the string
        System.out.println("Length: " + input.length());
        
        // 2. Convert to uppercase
        System.out.println("Uppercase: " + input.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + input.toLowerCase());

        // 4. Character at a specific index (e.g., index 0)
        if (input.length() > 0) {
            System.out.println("Character at index 0: " + input.charAt(0));
        }

        // 5. Substring from index 0 to 4 (if long enough)
        if (input.length() >= 5) {
            System.out.println("Substring (0 to 4): " + input.substring(0, 4));
        }

        // 6. Check if it contains "java"
        System.out.println("Contains 'java': " + input.contains("java"));

        // 7. Replace 'a' with '@'
        System.out.println("Replace 'a' with '@': " + input.replace('a', '@'));

        // 8. Trim leading and trailing spaces
        System.out.println("Trimmed: '" + input.trim() + "'");

        // 9. Check if string starts with "Hello"
        System.out.println("Starts with 'Hello': " + input.startsWith("Hello"));

        // 10. Check if string is empty
        System.out.println("Is empty: " + input.isEmpty());

        scanner.close();
    }
}


