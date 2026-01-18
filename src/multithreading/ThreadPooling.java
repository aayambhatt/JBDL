package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// you can use at max n number of threads at the same time
// create a fixed number of threads once and reuse them to execute many tasks
public class ThreadPooling {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <=5 ; i++) {
            int taskId = i;
            executorService.submit(()->{
                System.out.println("Task: " + taskId + " executed by, " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();

    }



}

class NoThreadPool{
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            int taskId = i;
            Thread t = new Thread(()->{
                System.out.println("Task: " + taskId + " executed by, " + Thread.currentThread().getName());
            });

            t.start();

        }
    }
}
