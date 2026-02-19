package LabUnit6;

class Outer {
    void display() {
        System.out.println("Display from Outer class");
    }

    class Inner {
        void display() {
            System.out.println("Display from Inner class");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // 1. Call Outer class method
        Outer outObj = new Outer();
        outObj.display();

        // 2. Call Inner class method
        // Syntax: OuterClassName.InnerClassName innerObj = outerObj.new InnerClassName();
        Outer.Inner inObj = outObj.new Inner();
        inObj.display();
    }
}
