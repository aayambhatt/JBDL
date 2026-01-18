package multithreading;

public class ThreMain {
    public static void main(String[] args) {
       Thread t1 = new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker: " + i);
            }
        });

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}
