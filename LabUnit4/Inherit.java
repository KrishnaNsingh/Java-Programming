package LabUnit4;

class A {
    void messageA() { System.out.println("This is Class A (Parent)"); }
}

class B extends A {
    void messageB() { System.out.println("This is Class B (Child)"); }
}

public class Inherit {
    public static void main(String[] args) {
        B obj = new B();
        obj.messageA(); // Inherited method
        obj.messageB(); // Own method
    }
}