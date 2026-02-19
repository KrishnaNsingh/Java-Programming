package LabUnit4;

class StaticDemo {
    static int count = 0; // Static variable

    // Static block
    static {
        System.out.println("Static block initialized.");
        count = 10;
    }

    // Static method
    static void displayCount() {
        System.out.println("Current Count: " + count);
    }

    public static void main(String[] args) {
        StaticDemo.displayCount();
        StaticDemo.count++;
        StaticDemo.displayCount();
    }
}