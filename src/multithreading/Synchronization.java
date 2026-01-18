package multithreading;

public class Synchronization {

    static long bankBalance = 1_00_00_00_00_000L;

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(()-> add(1_00_000));
        Thread th2 = new Thread(()->add(15));

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(bankBalance);

    }

    public static void add(long valueToAdd){
        bankBalance += valueToAdd;

    }

}
