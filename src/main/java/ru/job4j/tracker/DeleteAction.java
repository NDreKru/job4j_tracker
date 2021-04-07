package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ====");
        int id = input.askInt("Enter Id for delete: ");
        if (tracker.delete(id)) {
            out.println("Item with Id " + id + " successfully deleted.");
        } else {
            out.println("Error. Unable to delete item with Id " + id);
        }
        return true;
    }
}
