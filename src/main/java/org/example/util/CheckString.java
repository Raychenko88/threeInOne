package org.example.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckString {

    public static void firstOption(String string) {
        StringBuilder result = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (String str : string.split(" ")) {
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i > 1 && list.get(i).equals("Ave") || list.get(i).equals("Ave.")) {
                result.append("Avenue" + " ");
            } else if (i > 1 && list.get(i).equals("Ave,") || list.get(i).equals("Ave.,")) {
                result.append("Avenue," + " ");
            } else if (list.get(i).equals("St") || list.get(i).equals("St.") ||
                    list.get(i).equals("Str") || list.get(i).equals("Str.")) {
                result.append("Street" + " ");
            } else if (list.get(i).equals("St,") || list.get(i).equals("St.,") ||
                    list.get(i).equals("Str,") || list.get(i).equals("Str.,")) {
                result.append("Street," + " ");
            } else {
                result.append(list.get(i) + " ");
            }
        }
        System.out.println(result);
    }

    public static void secondOptiion(String string) {
        List toReplaceAvenue = Arrays.asList("Ave.", "Ave", "Ave,", "Ave.,");
        List toReplaceStreet = Arrays.asList("Str.", "Str", "St.", "St", "St,", "St.,", "Str,", "Str.,");

        StringBuilder result = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (String str : string.split(" ")) {
            list.add(str);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 1 && toReplaceAvenue.contains(list.get(i))) {
                result.append(list.get(i).replace(list.get(i), "Avenue, "));
            }else if (toReplaceStreet.contains(list.get(i))) {

                result.append(list.get(i).replace(list.get(i), "Street, "));

            }else {
                result.append(list.get(i) + " ");
            }
        }
        System.out.println(result);
    }
}
