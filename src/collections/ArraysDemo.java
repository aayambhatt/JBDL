package collections;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        // creating a list
        List<String> names = new ArrayList<>();
        // adding elements
        names.add("Aayam");
        names.add("Rohit");

        // iterating through it
        for(String s : names){
            System.out.println(s);
        }

        // accessing
        System.out.println("Accessing by index: " + names.get(1));

        // expensive operation O(n)
        names.add(1, "InsertedAtMiddle");

        for(String s : names){
            System.out.println(s);
        }

        names.remove(1);
        System.out.println(names);
    }

}



