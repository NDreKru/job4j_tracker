package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Homer J. Simpson");
        student.setGroup("SP-121");
        student.setEntryDate(new Date());
        System.out.println("Student's full name: " + student.getFullName() + System.lineSeparator()
                + "Student's group: " + student.getGroup() + System.lineSeparator()
                + "Student's date of entry: " + student.getEntryDate());
    }
}
