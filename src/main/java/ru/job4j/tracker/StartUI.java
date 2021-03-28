package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("test item 1"));
        System.out.println("Founded item name: " + tracker.findById(1).getName());
    }
}
