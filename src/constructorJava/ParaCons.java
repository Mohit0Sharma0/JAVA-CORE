package constructorJava;
public class ParaCons {
    String name;
    int age;
    String course;

    ParaCons(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        ParaCons s1 = new ParaCons("Mohit Sharma", 21, "Java Full Stack");
        ParaCons s2 = new ParaCons("Ravi", 22, "Python Developer");

        System.out.println("\nStudent 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}
