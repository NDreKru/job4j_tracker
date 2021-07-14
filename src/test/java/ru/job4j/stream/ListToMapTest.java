package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ListToMapTest {

    @Test
    public void listToMap() {
         List<Student> students = List.of(
                new Student(80, "Ivanov"),
                new Student(70, "Petrov"),
                new Student(55, "Sidorov"),
                new Student(80, "Ivanov"),
                new Student(55, "Sidorov"));

        Map<String, Student> expected = Map.of(
                "Ivanov", new Student(80, "Ivanov"),
                "Petrov", new Student(70, "Petrov"),
                "Sidorov", new Student(55, "Sidorov"));
         ListToMap map = new ListToMap();
         assertThat(map.listToMap(students), is(expected));
    }
}