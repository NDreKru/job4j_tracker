package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println();
            } else if (select == 1) {
                System.out.println("=== List of all Items ====");
                Item[] allItems = tracker.findAll();
                for (Item item : allItems) {
                    System.out.println(item);
                }
                System.out.println();
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter Id for edit: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new name of item: ");
                Item item = new Item(scanner.nextLine());
                if (tracker.replace(id, item)) {
                    System.out.println("Item with Id " + id + " successfully edited.");
                } else {
                    System.out.println("Error. Unable to edit item with Id " + id);
                }
                System.out.println();
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter Id for delete: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Item with Id " + id + " successfully deleted.");
                } else {
                    System.out.println("Error. Unable to delete item with Id " + id);
                }
                System.out.println();
            } else if (select == 4) {
                System.out.println("=== Find item by Id====");
                System.out.print("Enter id of item: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item foundItem = tracker.findById(id);
                if (foundItem != null) {
                    System.out.println(foundItem);
                } else {
                    System.out.println("Unable to find item with Id " + id);
                }
                System.out.println();
            } else if (select == 5) {
                System.out.println("=== Find item by name====");
                System.out.print("Enter name of item: ");
                String currName = scanner.nextLine();
                Item[] foundItems = tracker.findByName(currName);
                if (foundItems.length > 0) {
                    for (Item item : foundItems) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Unable to find items with name " + currName);
                }
                System.out.println();
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu. \n"
                + "0. Add new Item \n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n"
                + "Select:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

