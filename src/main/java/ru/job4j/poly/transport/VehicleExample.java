package ru.job4j.poly.transport;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] array = {airplane, train, bus};
        for (Vehicle vehicle : array) {
            vehicle.move();
            vehicle.takePassengers();
            System.out.println();
        }
    }
}
