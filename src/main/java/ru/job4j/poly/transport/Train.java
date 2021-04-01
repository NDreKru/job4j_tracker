package ru.job4j.poly.transport;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " move on railroad");
    }

    @Override
    public void takePassengers() {
        System.out.println(getClass().getSimpleName()
                + " accepts passengers only at railroad stations");
    }
}
