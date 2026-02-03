package LabUnit3;

class Room {
    // Attributes
    int roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;

    // Member function to set data
    public void setdata(int rno, String rtype, float rarea, boolean hasAC) {
        roomno = rno;
        roomtype = rtype;
        roomarea = rarea;
        ACmachine = hasAC;
    }

    // Member function to display data
    public void displaydata() {
        System.out.println("---------- Room Details ----------");
        System.out.println("Room Number   : " + roomno);
        System.out.println("Room Type     : " + roomtype);
        System.out.println("Area (sq. ft) : " + roomarea);
        System.out.println("AC Available  : " + (ACmachine ? "Yes" : "No"));
        System.out.println("----------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Room class
        Room myRoom = new Room();

        // Setting data for the room
        myRoom.setdata(101, "Deluxe Suite", 450.5f, true);

        // Displaying the room information
        myRoom.displaydata();
    }
}