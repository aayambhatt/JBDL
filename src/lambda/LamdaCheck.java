package lambda;

public class LamdaCheck{
    public static void main(String[] args) {
        Check c1 = () -> {
            return 4<5;
        };
        System.out.println(c1.check());
    }
}