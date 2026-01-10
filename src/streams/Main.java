package streams;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Banana", 3);
        fruitMap.put("Apple", 4);
        fruitMap.put("Mango", 1);

        List<String> fruitList = Arrays.asList("Banana", "Apple", "Mango", "Guava", "Strawberry");

        List<String> result = fruitList.stream()
                .map(fruit -> {
                    int count;
                    if (fruitMap.containsKey(fruit)) {
                        count = fruitMap.get(fruit);
                    } else {
                        count = 0;
                    }
                    return fruit + ":" + count;
                })
                .toList();

        System.out.println(result);
    }
}