public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.color);
        child.eat();

        Parent parent = new Parent();
        System.out.println(parent.color);
        parent.eat();

        Parent p = new Child();
        System.out.println(p.color);
        p.eat();

    }

}

class Parent{
     String color = "brown";

    void eat(){
        System.out.println("Parent eating");
    }
}

class Child extends Parent{

    @Override
    void eat(){
        System.out.println("Child eating");
    }
}
