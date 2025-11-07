package constructorJava;

public class NoArgumentCon {
    static class Student {
        String name;
        int age;
        Student(){
            name = "Mohit";
            age = 21;
            System.out.println("Student Constructor Started");
        }
    }

    // this code is for cons example for no argument..
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name + " "+ s1.age);
    }
}
