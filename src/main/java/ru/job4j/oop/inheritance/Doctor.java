package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String skill;

    public Doctor(String name, String surname, String education, String birthday, String skill) {
        super(name, surname, education, birthday);
        this.skill = skill;
    }

    public Diagnosis inspect(Patient patient) {}
}
