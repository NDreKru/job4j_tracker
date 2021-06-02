package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenEqualsNamesAndDescByPriority() {
        Comparator<Job> comparator = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = comparator.compare(new Job("X task", 0), new Job("X task", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenDescByNamesAndDescByPriority() {
        Comparator<Job> comparator = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = comparator.compare(new Job("Fix bug", 5), new Job("X task", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAscByNamesAndAscByPriority() {
        Comparator<Job> comparator = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = comparator.compare(new Job("Fix bug", 0), new Job("X task", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenEqualsNamesAndAscByPriority() {
        Comparator<Job> comparator = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = comparator.compare(new Job("Fix bug", 0), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }
}