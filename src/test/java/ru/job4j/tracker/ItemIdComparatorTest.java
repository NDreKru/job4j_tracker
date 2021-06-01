package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemIdComparatorTest {

    @Test
    public void whenNaturalOrder() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(2,"second"));
        list.add(new Item(1,"first"));
        Collections.sort(list, new ItemIdComparator());
        assertThat(list, is(List.of(new Item(1, "first"), new Item(2, "second"))));
    }
}