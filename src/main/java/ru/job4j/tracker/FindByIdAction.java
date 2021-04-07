package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by Id====");
        int id = Integer.parseInt(input.askStr("Enter id of item: "));
        Item foundItem = tracker.findById(id);
        if (foundItem != null) {
            out.println(foundItem);
        } else {
            out.println("Unable to find item with Id " + id);
        }
        return true;
    }
}
