package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String iq;

    public Engineer(String name, String surname, String education, String birthday, String iq) {
        super(name, surname, education, birthday);
        this.iq = iq;
    }

    public double calculate(double value1, double value2) {}
}