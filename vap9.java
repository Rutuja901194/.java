
    public class vap9 {
        public static void main(String[] args)
        
        {

            // --- join() Method ---
            String joined = String.join(" - ", "Java", "Python", "C++", "JavaScript");
            System.out.println("Joined string using join(): " + joined);
    

            // --- contains() Method ---
            String languageList = "Java, Python, C++, JavaScript";

            
            // Check if "Python" is in the list                                                                                                                                                                                                                                                            
            boolean hasPython = languageList.contains("Python");
            System.out.println("Contains 'Python': " + hasPython);
    

            // Check if "Ruby" is in the list
            boolean hasRuby = languageList.contains("Ruby");
            System.out.println("Contains 'Ruby': " + hasRuby);
        
        
        }
    }
    