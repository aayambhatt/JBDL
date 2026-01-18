package multithreading;

public class ThreadCommunication {

    /*
    Thread communication is the mechanism when threads coordinate their execution and share state safety

    It is used when:
     - One thread must wait for another
     - Threads must be notified when a condition changes
     - When order of execution matters


    Core java communication methods:
        - wait() : Releases the lock and waits
        - notify() : Wakes one waiting thread
        - notifyAll() : Wakes all waiting threads

     These functions must be called in a synchronized context, or it will throw:
        IllegalMonitorStateException

     How it works:
        Thread A enters synchronized block : gets lock/monitor
        Thread A calls wait() : A released lock + sleeps
        Thread B enters synchronized block
        Thread B calls notify()
        Thread A wakes up and reacquires lock

     */

    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1 waiting...");
                    lock.wait();
                    System.out.println("Thread 1 has resumed");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });




        Thread t2 = new Thread(()->{
           synchronized (lock){
               System.out.println("Thread 2 notifying...");
               lock.notify();
               System.out.println("Thread 2 has notified");
           }
        });

        t1.start();
        Thread.sleep(1_000);
        t2.start();
    }

}
