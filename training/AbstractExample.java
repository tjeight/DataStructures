abstract class Animal {
    abstract void sound(); // abstract method

    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barks");
    }
}

public class AbstractExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe();

    }

}