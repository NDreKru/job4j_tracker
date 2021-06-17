package ru.job4j.lambda;

import java.util.Comparator;

public class LambdaUsage {

    public static void main(String[] args) {
        Comparator<String> stringDescComparator = (str1, str2) -> {
            System.out.println("compare in descending order - " + str1 + ":" + str2);
            return str2.compareTo(str1);
        };
    }
}
