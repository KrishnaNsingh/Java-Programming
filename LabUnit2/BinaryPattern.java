package LabUnit2;

public class BinaryPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("1 ");
            for (int j = 0; j < i; j++) {
                System.out.print("0 ");
            }
            System.out.println("1");
        }
    }
}