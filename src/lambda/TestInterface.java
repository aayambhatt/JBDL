package lambda;

/**
 * when an interface has only one absract method, it is functional interface
 */
@FunctionalInterface
public interface TestInterface {

    void teach();
}

@FunctionalInterface
interface Add{
    int add(int z);
}

//class Teach implements TestInterface{
//
//    @Override
//    public void teach(){
//        System.out.println("Teaching java and backend");
//    }
//}

class Demo1 {
    public static void main(String[] args) {
        //syntax
        /*
            (arguements) -> {
            function body
            }
         */
        TestInterface tI = () -> {
            System.out.println("Teaching java and backend");
        };
        tI.teach();

        int a = 5;
        Add z = (int x) -> {
            return 5+x;
        };
        int y = z.add(10);
        System.out.println(y);
    }
}
