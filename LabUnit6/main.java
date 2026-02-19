package LabUnit6;

interface A {
    void meth1();
    void meth2();
}

class MyClass implements A {
    public void meth1() {
        System.out.println("Implementation of meth1");
    }

    public void meth2() {
        System.out.println("Implementation of meth2");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
    }
}
