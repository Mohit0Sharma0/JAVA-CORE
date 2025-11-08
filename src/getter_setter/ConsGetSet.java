package getter_setter;
class Students {
    private String name;
    private int age;
    // Constructor
    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}
public class ConsGetSet {
    public static void main(String[] args) {
        Students s1 = new Students("Ravi", 22);
        System.out.println(s1.getName() + " - " + s1.getAge());

        s1.setAge(23);
        System.out.println("Updated Age: " + s1.getAge());
    }
}

