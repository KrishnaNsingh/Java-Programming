package LabUnit5;

class Shape {
    void draw() { System.out.println("Drawing a shape"); }
    void erase() { System.out.println("Erasing a shape"); }
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing a Circle"); }
    void erase() { System.out.println("Erasing a Circle"); }
}

class Triangle extends Shape {
    void draw() { System.out.println("Drawing a Triangle"); }
    void erase() { System.out.println("Erasing a Triangle"); }
}

class Square extends Shape {
    void draw() { System.out.println("Drawing a Square"); }
    void erase() { System.out.println("Erasing a Square"); }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphic reference
        Shape s;

        s = new Circle();
        s.draw(); // Calls Circle's draw

        s = new Triangle();
        s.draw(); // Calls Triangle's draw
    }
}
