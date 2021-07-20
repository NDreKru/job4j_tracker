package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapUsage {
    public static List<Integer> convertMatrixToList(Integer[][] array) {
        return Arrays.stream(array)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}
