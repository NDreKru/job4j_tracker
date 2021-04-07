package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ====");
        int id = input.askInt("Enter Id for edit: ");
        Item item = new Item(input.askStr("Enter new name of item: "));
        if (tracker.replace(id, item)) {
            out.println("Item with Id " + id + " successfully edited.");
        } else {
            out.println("Error. Unable to edit item with Id " + id);
        }
        return true;
    }
}
