package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        for (int i = 0; i < o1.length() && i < o2.length(); i++) {
            result = o1.charAt(i) - o2.charAt(i);
            if (result != 0) {
                return result;
            }
        }
        if (o1.length() != o2.length()) {
            result = o1.length() - o2.length();
        }
        return result;
    }
}
