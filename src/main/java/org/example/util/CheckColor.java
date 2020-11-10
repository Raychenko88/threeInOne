package org.example.util;

public class CheckColor {

    public static void checkColorMethod(Integer number) {
        for (int i = 0; i < 60; i += 5) {
            if (number >= i && number <= i + 2) {
                System.out.println("green");
                break;
            } else if (number == i + 3) {
                System.out.println("yellow");
                break;
            } else if (number == i + 4) {
                System.out.println("red");
                break;
            }
        }
    }

    public static void checkColorMethod(Double number) {
        for (int i = 0; i < 60; i += 5) {
            if (number >= i && number < i + 3) {
                System.out.println("green");
                break;
            } else if (number >= i + 3 && number < i + 4) {
                System.out.println("yellow");
                break;
            } else if (number >= i + 4 && number < i + 5) {
                System.out.println("red");
                break;
            }
        }
    }
}
