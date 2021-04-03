package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println();
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== List of all Items ====");
        Item[] allItems = tracker.findAll();
        for (Item item : allItems) {
            System.out.println(item);
        }
        System.out.println();
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = Integer.parseInt(input.askStr("Enter Id for edit: "));
        Item item = new Item(input.askStr("Enter new name of item: "));
        if (tracker.replace(id, item)) {
            System.out.println("Item with Id " + id + " successfully edited.");
        } else {
            System.out.println("Error. Unable to edit item with Id " + id);
        }
        System.out.println();
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter Id for delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item with Id " + id + " successfully deleted.");
        } else {
            System.out.println("Error. Unable to delete item with Id " + id);
        }
        System.out.println();
    }

    public static void findByID(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id====");
        int id = Integer.parseInt(input.askStr("Enter id of item: "));
        Item foundItem = tracker.findById(id);
        if (foundItem != null) {
            System.out.println(foundItem);
        } else {
            System.out.println("Unable to find item with Id " + id);
        }
        System.out.println();
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name====");
        String currName = input.askStr("Enter name of item: ");
        Item[] foundItems = tracker.findByName(currName);
        if (foundItems.length > 0) {
            for (Item item : foundItems) {
                System.out.println(item);
            }
        } else {
            System.out.println("Unable to find items with name " + currName);
        }
        System.out.println();
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select:"));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByID(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu." + System.lineSeparator()
                + "0. Add new Item." + System.lineSeparator()
                + "1. Show all items." + System.lineSeparator()
                + "2. Edit item." + System.lineSeparator()
                + "3. Delete item." + System.lineSeparator()
                + "4. Find item by Id." + System.lineSeparator()
                + "5. Find items by name." + System.lineSeparator()
                + "6. Exit Program.");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

