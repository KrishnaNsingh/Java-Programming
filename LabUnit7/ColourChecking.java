package LabUnit7;

import java.awt.Color;

public class ColourChecking {
    public static void main(String[] args) {
        int r = 193, g = 255, b = 183;

        // Convert RGB to HSB
        float[] hsb = Color.RGBtoHSB(r, g, b, null);

        System.out.println("RGB Values: Red=" + r + ", Green=" + g + ", Blue=" + b);
        System.out.println("--- HSB Results ---");
        System.out.println("Hue: " + hsb[0]);
        System.out.println("Saturation: " + hsb[1]);
        System.out.println("Brightness: " + hsb[2]);
    }
}
