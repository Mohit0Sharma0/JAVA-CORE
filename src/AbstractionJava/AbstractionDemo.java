package AbstractionJava;

abstract class Animal {
    abstract void sound(); // abstract method

    void eat() { // normal method
        System.out.println("All animals eat food");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Dog’s implementation
        a.eat();    // From abstract class
    }
}
