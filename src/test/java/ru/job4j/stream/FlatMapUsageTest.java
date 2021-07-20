package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FlatMapUsageTest {

    @Test
    public void convertMatrixToList() {
        Integer[][] array = {{1, 2}, {3, 4}, {5, 6}};
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertThat(FlatMapUsage.convertMatrixToList(array), is(expected));
    }
}