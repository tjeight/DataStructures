class Employee {

    public void printEmployee() {
        System.out.println("This is employee ");
    }
}

class Manager extends Employee {
    public void printDemo() {
        System.out.println("This is Manager");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.printDemo();
        manager.printEmployee();

    }

}