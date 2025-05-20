public class vap11 {

        // Child thread class extending Thread
        static class NamePrinter extends Thread {
            private String[] names;
    
            // Constructor to initialize names array
            NamePrinter(String[] names) {
                this.names = names;
            }
    
            @Override
            public void run() {
                for (String name : names) {
                    System.out.println("Child Thread - Name: " + name);
                    try {
                        Thread.sleep(100); // Optional: delay for readability
                    } catch (InterruptedException e) {
                        System.out.println("Child thread interrupted");
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            // Array of names for the child thread
            String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
    
            // Array of cities for the main thread
            String[] cities = {"New York", "London", "Tokyo", "Paris", "Sydney"};
    
            // Create and start the child thread
            NamePrinter childThread = new NamePrinter(names);
            childThread.start();
    
            // Main thread prints cities
            for (String city : cities) {
                System.out.println("Main Thread - City: " + city);
                try {
                    Thread.sleep(100); // Optional: delay for readability
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted");
                }
            }
    
            // Wait for child thread to complete (optional)
            try {
                childThread.join();
            } catch (InterruptedException e) {
                System.out.println("Join interrupted");
            }
    
            System.out.println("Main thread finished.");
        }
    }
    

