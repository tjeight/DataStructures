package Operators;

class Animal {
}

class Dog extends Animal {
}

public class SpecialOperator {
    public static void main(String[] args) {
        Animal a = new Dog();

        // Check actual object type
        if (a instanceof Dog) {
            System.out.println("Yes, it's a Dog!");
        } else {
            System.out.println("No, it's not a Dog.");
        }
    }
}
