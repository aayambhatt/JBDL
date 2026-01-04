package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.add("Aayam");
        names.add("Rohit");
        names.add("Kunal");

        System.out.println(names);

        // insert in middle
        names.add(1, "InsertedAtMiddle");

        System.out.println(names);

        // remove from middle
        names.remove(1);

        System.out.println(names);
    }
}
