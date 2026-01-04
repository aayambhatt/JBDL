package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Playground {
    public static void main(String[] args) {
        //Hashmap, LinkedHashMap, TreeMap

        Map<Integer, String> mpp = new HashMap<>();

        mpp.put(1, "Aayam");
        mpp.put(2, "Aaryan");
        mpp.put(3, "Sunil");

        System.out.println(mpp);

        Map<String, String> mpp2 = new LinkedHashMap<>();
        mpp2.put("Hyderabad", "Aayam");
        mpp2.put("Bengaluru", "Arman");

        System.out.println(mpp2);

        System.out.println(mpp.get(3));

    }
}
