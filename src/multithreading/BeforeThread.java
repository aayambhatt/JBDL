package multithreading;

public class BeforeThread {
    public static void main(String[] args) {
        System.out.println("Start");

       // task() blocks main until it finishes
        task();

        System.out.println("End");

    }

    static void task(){
        for(int i = 1 ; i<=5 ; i++){
            System.out.println("Task: " + i);

        }
    }
}
