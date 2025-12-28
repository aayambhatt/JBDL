package abstraction;

public class MyStatic {
    public static void main(String[] args) {
        Student s1 = new Student("Aayam");
        System.out.println(Student.universityName);



    }
}

class Student{
    String name;
    static String universityName = "GFG";
    public Student(String name){
        this.name = name;
    }
}
