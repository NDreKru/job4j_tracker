package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.junit.Assert.assertThat;

public class JobDescByNameTest {

    @Test
    public void compare() {
        Comparator<Job> comparator = new JobDescByName();
        int rsl = comparator.compare(new Job("X task", 0), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }
}