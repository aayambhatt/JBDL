package multithreading;

public class CounterWithoutSync {
    static int count = 0;

    // if we dont use synchronized keyword here, output of count would be inconsistent
    synchronized static void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                increment();
            } 
        });


        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);

    }
}
