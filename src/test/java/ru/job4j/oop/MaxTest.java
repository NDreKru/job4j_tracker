package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max2numbers() {
        assertThat(Max.max(1, 2), is(2));
    }

    @Test
    public void max3numbers() {
        assertThat(Max.max(1, 2, 3), is(3));
    }

    @Test
    public void max4numbers() {
        assertThat(Max.max(1, 2, 3, 4), is(4));
    }
}