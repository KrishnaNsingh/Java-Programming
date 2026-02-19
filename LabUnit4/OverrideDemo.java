package LabUnit4;

class Animal {
    void sound() { System.out.println("Animal makes a sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks"); }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.sound(); // Calls the overridden version
    }
}
