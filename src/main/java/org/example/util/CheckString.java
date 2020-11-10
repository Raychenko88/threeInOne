package org.example.util;

import java.util.ArrayList;
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
        String str = string.replaceAll("Ave." + (","), "Avenue");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        System.out.println(stringBuilder.toString().replaceAll("St.|Str.", "Street"));
    }
}
