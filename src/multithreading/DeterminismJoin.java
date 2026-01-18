package multithreading;

public class DeterminismJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread(()->{
           for(int i = 1 ; i<=5 ; i++){
               System.out.println("Worker: " + i);
           }
        });

        t2.start();

        t2.join(); // <-- main waits here

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }

    }
}
