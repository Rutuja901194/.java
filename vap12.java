public class vap12 {

        public static void main(String[] args) {
    
            // Get reference to the main thread
            Thread mainThread = Thread.currentThread();
    
            // Print initial details
            System.out.println("Initial Main Thread Details:");
            System.out.println("Name: " + mainThread.getName());
            System.out.println("Priority: " + mainThread.getPriority());
    
            // Java threads don't expose parent thread directly,
            // but all threads are created by other threads, including 'main'
            // We simulate the parent info by checking the current thread's group
            ThreadGroup group = mainThread.getThreadGroup();
            System.out.println("Thread Group (acts like parent): " + group.getName());
    
            System.out.println("\n--- Modifying main thread ---\n");
    
            // Rename and raise priority by 2 (but max is 10)
            mainThread.setName("ModifiedMainThread");
    
            int newPriority = Math.min(mainThread.getPriority() + 2, Thread.MAX_PRIORITY);
            mainThread.setPriority(newPriority);
    
            // Print updated details
            System.out.println("Updated Main Thread Details:");
            System.out.println("Name: " + mainThread.getName());
            System.out.println("Priority: " + mainThread.getPriority());
            System.out.println("Thread Group: " + group.getName());
        }
}

