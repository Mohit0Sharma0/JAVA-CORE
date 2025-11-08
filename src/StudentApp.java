import java.util.Scanner;

public class StudentApp {
    public class Student{
        String name;
        int age;
        String course;

        Student(){
            name = "Unknown";
            age = 0;
            course = "Not Decided Yet";
            System.out.println("Default student object created");
        }
        void inputDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter roll no: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }
        void display() {
            System.out.println("Name: " + name);
            System.out.println("age: " + age);
            System.out.println("Course: " + course);
        }

    }
    public static void main(String[] args) {
        StudentApp app = new StudentApp();
        Student s1 = app.new Student();
        System.out.println("\nDefault Data:");
        s1.display();
        System.out.println("\nEnter new details:");
        s1.inputDetails();
        System.out.println("\nUpdated Data:");
        s1.display();
    }
}
