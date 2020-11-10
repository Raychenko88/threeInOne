package org.example.util;

public class Recursion {

    private static Integer num = 1;

    public static void recursionMethod(Integer number) {
        if (num <= number) {
            System.out.println(num);
            num++;
            recursionMethod(number);
        }
    }
}
