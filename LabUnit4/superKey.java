package LabUnit4;

class Parent {
    String name = "Parent Class";
    
    Parent() { System.out.println("Parent Constructor called."); }
}

class Child extends Parent {
    String name = "Child Class";

    Child() {
        super(); // Calls Parent constructor
    }

    void display() {
        System.out.println("Name in Child: " + name);
        System.out.println("Name in Parent: " + super.name); // Accessing parent variable
    }

    public static void superKey(String[] args) {
        Child c = new Child();
        c.display();
    }
}