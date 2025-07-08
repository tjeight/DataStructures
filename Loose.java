interface Animal {

    void speak();

}

class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("This is from dog");
    }

}

class Zoo {
    Animal animal;

    public Zoo(Animal animal) {
        animal.speak();
    }

}

public class Loose {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(new Dog());
    }

}