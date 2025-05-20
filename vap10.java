    public class vap10 {

        // Child thread class implementing Runnable
        static class ReversePrinter implements Runnable {
            @Override
            public void run() {
                for (int i = 250; i >= 200; i--) {
                    System.out.println("Child Thread: " + i);
                    try {
                        Thread.sleep(50); // Optional: slows down for readability
                    } catch (InterruptedException e) {
                        System.out.println("Child thread interrupted");
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            // Creating a Runnable instance
            ReversePrinter reversePrinter = new ReversePrinter();
            
            // Creating a Thread with the Runnable
            Thread childThread = new Thread(reversePrinter);
            
            // Start the child thread
            childThread.start();
    
            // Main thread work
            for (int i = 950; i <= 1000; i++) {
                System.out.println("Main Thread: " + i);
                try {
                    Thread.sleep(50); // Optional: slows down for readability
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted");
                }
            }
    
            // Wait for the child thread to finish before exiting (optional)
            try {
                childThread.join();
            } catch (InterruptedException e) {
                System.out.println("Join interrupted");
            }
    
            System.out.println("Main thread finished.");
        }
    }
    

