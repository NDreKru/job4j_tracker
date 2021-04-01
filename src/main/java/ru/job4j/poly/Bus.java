package ru.job4j.poly;

public class Bus implements Transport {
    private int passengers;
    private double tank;

    @Override
    public void drive() {
        System.out.println("The bus is going");
    }

    @Override
    public void passengers(int p) {
        this.passengers = p;
    }

    @Override
    public double fill(double volume) {
        double cost = 5.5;
        return cost * volume;
    }
}
