package interfaces;

public class Connect implements Human,Animal{
        public void eat(){
            System.out.println("Human Eat");
        }
        public void drink(){
            System.out.println("Human Drink");
        }
        public void sleep() {
            System.out.println("Human Sleep");
        }

    public static void main(String[] args) {
        Connect h = new Connect();
        h.eat();
        h.drink();
        h.sleep();
    }
    }

