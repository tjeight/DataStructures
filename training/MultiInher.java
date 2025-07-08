class A {

    public void demoA() {
        System.out.println("This method is from A");
    }
}

class B extends A {
    public void demoB() {
        System.out.println("This method is from B");
    }
}

class C extends B {
    public void demoC() {
        System.out.println("This is method from C");
    }
}

public class MultiInher {

    public static void main(String[] args) {

        C c = new C();
        c.demoA();
        c.demoB();
        c.demoC();

    }

}