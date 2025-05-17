
    public class vap6 {
        public static void main(String[] args) {
            // --- StringBuilder insert() method demonstration ---
            StringBuilder sb = new StringBuilder("JavaProgramming");
            System.out.println("Original StringBuilder: " + sb);
    
            // Insert "Advanced" at index 4
            sb.insert(4, "Advanced");
            System.out.println("After insert(4, \"Advanced\"): " + sb);
    
            // --- String compareTo() and compareToIgnoreCase() demonstration -----------
            String str1 = "Java";
            String str2 = "java";
            String str3 = "JavaScript";
    
            System.out.println("\n--- String Comparison ---");
            // compareTo() - case-sensitive
            System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // Non-zero (case matters)
            System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // Lexicographical comparison
    
            // compareToIgnoreCase() - case-insensitive
            System.out.println("str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2)); // 0 (equal ignoring case)
        }
    }
    

