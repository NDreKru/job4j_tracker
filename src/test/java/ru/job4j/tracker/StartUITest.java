package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenExit() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[] {"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction()};
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator()
                + "0. Close program" + System.lineSeparator()));
    }

    @Test
    public void whenFindAll() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[] {"0", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ShowAllAction(output), new ExitAction()};
        new StartUI(output).init(input, tracker, actions);
        String menu = "Menu." + System.lineSeparator()
                + "0. Show all items" + System.lineSeparator()
                + "1. Close program" + System.lineSeparator();
        assertThat(output.toString(), is(menu + "=== List of all Items ====" + System.lineSeparator() + menu));
    }

    @Test
    public void whenNotFoundByName() {
        Output output = new StubOutput();
        String[] answers = {"0", "a", "1"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction[] actions = {new FindByNameAction(output), new ExitAction()};
        new StartUI(output).init(input, tracker, actions);
        String menu = "Menu." + System.lineSeparator()
                + "0. Find item by name" + System.lineSeparator()
                + "1. Close program" + System.lineSeparator();
        assertThat(output.toString(), is(menu + "=== Find item by name===="
                + System.lineSeparator() + "Unable to find items with name " + answers[1]
                + System.lineSeparator() + menu));
    }

    @Test
    public void whenFindByID() {
        Output output = new StubOutput();
        String[] answers = {"0", "1", "1"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        Item item = new Item("a");
        tracker.add(item);
        UserAction[] actions = {new FindByIdAction(output), new ExitAction()};
        new StartUI(output).init(input, tracker, actions);
        String menu = "Menu." + System.lineSeparator()
                + "0. Find item by ID" + System.lineSeparator()
                + "1. Close program" + System.lineSeparator();
        assertThat(output.toString(), is(menu + "=== Find item by Id===="
                + System.lineSeparator() + item.toString()
                + System.lineSeparator() + menu));
    }
}