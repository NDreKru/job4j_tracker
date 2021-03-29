package ru.job4j.tracker;

import java.util.Date;

public class StartUI {

    public static void main(String[] args) {
//        Tracker tracker = new Tracker();
//        tracker.add(new Item("test item 1"));
//        System.out.println("Founded item name: " + tracker.findById(1).getName());
        Item item = new Item(1, "First");
        System.out.println(item);
    }
}
