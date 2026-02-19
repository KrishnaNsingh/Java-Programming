package LabUnit6;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing Document...");
    }

    public void show() {
        System.out.println("Showing Preview...");
    }

    public static void main1(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
