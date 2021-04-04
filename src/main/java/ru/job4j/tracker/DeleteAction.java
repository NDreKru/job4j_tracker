package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter Id for delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item with Id " + id + " successfully deleted.");
        } else {
            System.out.println("Error. Unable to delete item with Id " + id);
        }
        return true;
    }
}
