
    public class vap7 {
        public static void main(String[] args) {
            String str = "AdvancedJavaProgramming";
    
            // --- getBytes() ---
            byte[] byteArray = str.getBytes();
            System.out.println("Bytes from getBytes():");
            for (byte b : byteArray) {
                System.out.print(b + " ");
            }
            System.out.println("\n");
    
            // --- getChars() ---
            char[] charArray = new char[10];
            try {
                str.getChars(0, 10, charArray, 0);  // Copy first 10 characters
                System.out.println("Characters from getChars():");
                for (char c : charArray) {
                    System.out.print(c + " ");
                }
            } catch (Exception e) {
                System.out.println("Exception in getChars: " + e);
            }
            System.out.println("\n");
    
            // --- lastIndexOf() ---
            int lastIndex = str.lastIndexOf("a");
            System.out.println("Last index of 'a': " + lastIndex);
    
            // --- matches() ---
            boolean match = str.matches(".*Java.*");  // Check if "Java" is in the string
            System.out.println("String matches regex \".*Java.*\": " + match);
        }
    }
    

