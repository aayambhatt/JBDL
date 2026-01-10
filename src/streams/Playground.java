package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playground {

    // Streams
    /*
    They are linked directly with lambdas and collections and maps
    They are used to perform an operation on a collection or a map
    they convert the collection/map into an intermediate state (called stream)
    where operations can be made and then allow us to make
    operations and then close ths stream to get final output we need
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // I want to filter all the odd elements from the list and only keep the even ones
        // output: [2,4,6,8,10]

        List<Integer> result = list.stream().filter( (el) -> {
            return el%2==0;
        } ).toList();
        System.out.println(result);

    }
}
