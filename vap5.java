public class vap5 {
    public static void main(String[] args) {
            // Create a StringBuilder with initial content
            StringBuilder sb = new StringBuilder("AdvancedJava");
    
            System.out.println("Original StringBuilder: " + sb);
    
            // Reverse the contents
            sb.reverse();
            System.out.println("After reverse(): " + sb);
    
            // Delete characters from index 2 to 6 (excluding index 6)
            sb.delete(2, 6);
            System.out.println("After delete(2, 6): " + sb);
        }
    }
    
