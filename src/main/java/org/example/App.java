package org.example;


import org.example.util.CheckColor;
import org.example.util.CheckString;
import org.example.util.Recursion;

public class App {

    public static void main(String[] args) {
        // 1
        Recursion.recursionMethod(5);
        //  2.1
        CheckString.firstOption("555 Straight Stave Ave, San Francisco, CA 94104");
        CheckString.firstOption("444 Ave Maria Stairway St., San Francisco, CA 94104");
        //   2.2
        CheckString.secondOptiion("444 Ave Maria Stairway St., San Francisco, CA 94104");
        CheckString.secondOptiion("555 Straight Stave Ave, San Francisco, CA 94104");
        //  3
        CheckColor.checkColorMethod(5.5);
    }

}
