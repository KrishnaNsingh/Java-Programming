package LabUnit6;

interface Test {
    int square(int val);
}

class Arithmetic implements Test {
    // Implementing the square method
    public int square(int val) {
        return val * val;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        int result = obj.square(10);
        System.out.println("The square of 10 is: " + result);
    }
}
