public class Polymorphism {
/*
There are two types of polymorphism:
    Compile time
    Run time
 */
    public static void main(String[] args) {
        // method overloading
        System.out.println(addNumbers(3,5));
        System.out.println(addNumbers(5,6,7));

        // operator overloading
        System.out.println(5+6);
        System.out.println("Hello " + "World");
    }

    public static int addNumbers(int a, int b){
        return a+b;
    }

    public static int addNumbers(int a, int b, int c){
        return a+b+c;
    }



}
