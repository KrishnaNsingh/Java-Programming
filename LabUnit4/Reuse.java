package LabUnit4;

class Room {
    double area;
    Room(double area) { this.area = area; }
    void showRoom() { System.out.println("Room Area: " + area + " sq.ft"); }
}

class House {
    Room bedroom; // Reusing the Room class

    House() {
        bedroom = new Room(250.0);
    }

    void displayHouse() {
        System.out.println("House Details:");
        bedroom.showRoom();
    }

    public static void Reuse(String[] args) {
        House myHouse = new House();
        myHouse.displayHouse();
    }
}