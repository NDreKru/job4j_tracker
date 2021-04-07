package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name====");
        String currName = input.askStr("Enter name of item: ");
        Item[] foundItems = tracker.findByName(currName);
        if (foundItems.length > 0) {
            for (Item item : foundItems) {
                out.println(item);
            }
        } else {
            out.println("Unable to find items with name " + currName);
        }
        return true;
    }
}
