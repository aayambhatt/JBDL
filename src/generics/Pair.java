package generics;


/**
 * without generics, we are tied to this structure only..int->String
 * @param <K>
 * @param <V>
 */
public class Pair<K,V>{

    private K first;
    private V second;

    public Pair(int first, String second) {
        this.first = first;
        this.second = second;
    }

    public K getKey() {
        return first;
    }

    public void setKey(K first) {
        this.first = first;
    }

    public String getValue() {
        return second;
    }

    public void setValue(V second) {
        this.second = second;
    }
}

class Demo{
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(10, "Aayam");


    }
}

