package streams;

import java.util.Arrays;
import java.util.List;

public class FilterMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map((n) -> {
                    return n*2;
                })
                .toList();

        System.out.println(result);
    }
}
