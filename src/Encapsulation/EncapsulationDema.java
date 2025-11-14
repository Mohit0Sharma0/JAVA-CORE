package Encapsulation;

class Student {
    private String name;
    private int age;

    // Setter methods (to set values safely)
    public void setName(String name) {
        if(name.length() > 1)
            this.name = name;
        else
            System.out.println("Invalid name!");
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
        else
            System.out.println("Invalid age!");
    }

    // Getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDema {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Mohit");

        s1.setAge(21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        s1.setAge(-5);
    }
}

