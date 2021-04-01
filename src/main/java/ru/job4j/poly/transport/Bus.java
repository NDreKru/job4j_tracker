package ru.job4j.poly.transport;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " move on road");
    }

    @Override
    public void takePassengers() {
        System.out.println(getClass().getSimpleName()
                + " accepts passengers only at bus stations");
    }
}
