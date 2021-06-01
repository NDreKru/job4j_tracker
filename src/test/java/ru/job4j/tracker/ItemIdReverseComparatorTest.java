package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemIdReverseComparatorTest {

    @Test
    public void whenReverseOrder() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(1,"first"));
        list.add(new Item(2,"second"));
        list.add(new Item(3, "third"));
        Collections.sort(list, new ItemIdReverseComparator());
        assertThat(list, is(List.of(
                new Item(3, "third"),
                new Item(2, "second"),
                new Item(1, "first"))));
    }
}