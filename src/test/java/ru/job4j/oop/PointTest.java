package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX0Y10ToX20Y10Then20() {
        Point p1 = new Point(0, 10);
        Point p2 = new Point(20, 10);
        double rls = p1.distance(p2);
        double expect = 20.0;
        Assert.assertThat(rls, is(expect));
    }

    @Test
    public void whenX100Y0ToX100Y500Then500() {
        Point p1 = new Point(100, 0);
        Point p2 = new Point(100, 500);
        double rls = p1.distance(p2);
        double expect = 500.0;
        Assert.assertThat(rls, is(expect));
    }

    @Test
    public void distance3d() {
        Point p1 = new Point(100, 0, 20);
        Point p2 = new Point(100, 500, 800);
        double rsl = p1.distance3d(p2);
        double expect = 926.499;
        Assert.assertThat(rsl, closeTo(expect, 0.01));
    }
}