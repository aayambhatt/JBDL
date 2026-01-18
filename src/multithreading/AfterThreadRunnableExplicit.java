package multithreading;

public class AfterThreadRunnableExplicit {

    public static void main(String[] args) throws InterruptedException {
        // Main thread info
        System.out.println("Start" + ", thread name: " + Thread.currentThread().getName());

        // Step 1: Create a Runnable explicitly
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Task: " + i + ", thread name: " + Thread.currentThread().getName());
                }
            }
        };

        // Step 2: Create a Thread and pass the Runnable
        Thread t = new Thread(task);

        // Step 3: Start the thread
        t.start();

        // Step 4: Main thread continues
        System.out.println("End" + ", thread name: " + Thread.currentThread().getName());
    }
}
