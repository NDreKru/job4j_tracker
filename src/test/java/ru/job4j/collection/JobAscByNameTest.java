package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class JobAscByNameTest {

    @Test
    public void compare() {
        Comparator<Job> comparator = new JobAscByName();
        int rsl = comparator.compare(new Job("X task", 0), new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }
}