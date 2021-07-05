package ru.job4j.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Positive {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, -1, 5, 6, 83, -56, 3, -6, -67, -4, -700, 4);
        List<Integer> rsl = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
    }
}
