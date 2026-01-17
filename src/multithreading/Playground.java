package multithreading;

import java.util.Arrays;
import java.util.List;

 /*
    Two ways to create a thread in java:
    1. Using the thread class
    2. By using the runnable interface (used more)

  */

public class Playground {

    public static void main(String[] args) {
        System.out.println("Hello World: " + Thread.currentThread());

        NumberThread myThread = new NumberThread();
        myThread.start();

        FruitThread thread2 = new FruitThread();
        thread2.start();

    }
}

class NumberThread extends Thread{

    @Override
    public void run(){
       try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2_000);
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
           System.out.println("Thread was interrupted");
       }
    }

}

class FruitThread extends Thread{

    @Override
    public void run(){
        List<String> fruits = Arrays.asList("Banana", "Kiwi", "Apple");

        try {
            for(String s : fruits){
                System.out.println(s + " " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
