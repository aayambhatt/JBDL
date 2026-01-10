package lambda;

import java.util.function.Consumer;

public class Playground {
    public static void main(String[] args) {

        Consumer<String> myConsumer = (str)->{
            System.out.println(str.toUpperCase());
        };
        myConsumer.accept("hello");

    }
}
