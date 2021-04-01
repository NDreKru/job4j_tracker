package ru.job4j.poly.transport;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " fly in the sky");
    }

    @Override
    public void takePassengers() {
        System.out.println(getClass().getSimpleName()
                + " accepts passengers only at airports");
    }
}
