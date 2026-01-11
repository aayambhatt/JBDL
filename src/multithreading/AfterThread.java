package multithreading;

public class AfterThread {
    public static void main(String[] args) {
        System.out.println("Start" + ", thread name: " + Thread.currentThread().getName());

        Thread t = new Thread(()->{
           for(int i = 1 ; i<=5 ; i++){
               System.out.println("Task: " + i + ", thread name: " + Thread.currentThread().getName());
           }
        });

        t.start();

        System.out.println("End" + ", thread name: " + Thread.currentThread().getName());
    }
}
