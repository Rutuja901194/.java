
    public class vap8 {
        public static void main(String[] args) {
            String sentence = "Java is a powerful language";
    
            // --- split() ---
            System.out.println("Using split():");
            String[] words = sentence.split(" ");  // Split on space
            for (String word : words) {
                System.out.println(word);
            }
    
            // --- subSequence() ---
            System.out.println("\nUsing subSequence(0, 4):");
            CharSequence subSeq = sentence.subSequence(0, 4);  // Get "Java"
            System.out.println(subSeq);
    
            // --- valueOf() ---
            System.out.println("\nUsing valueOf():");
            int number = 100;
            boolean flag = true;
            char ch = 'A';
            double pi = 3.14159;
    
            String strNum = String.valueOf(number);
            String strFlag = String.valueOf(flag);
            String strChar = String.valueOf(ch);
            String strDouble = String.valueOf(pi);
    
            System.out.println("String.valueOf(int): " + strNum);
            System.out.println("String.valueOf(boolean): " + strFlag);
            System.out.println("String.valueOf(char): " + strChar);
            System.out.println("String.valueOf(double): " + strDouble);
        }
    }
    

