package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        if (item != null) {
            item.setId(ids++);
            items[size++] = item;
        }
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int resultSize = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[resultSize++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, resultSize);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int replaceableIndex = indexOf(id);
        boolean result = replaceableIndex != -1;
        if (result) {
            item.setId(id);
            items[replaceableIndex] = item;
        }
        return result;
    }

    public boolean delete(int id) {
        int delIndex = indexOf(id);
        boolean result = delIndex != -1;
        if (result) {
            items[delIndex] = null;
            System.arraycopy(items, delIndex + 1, items, delIndex, size - delIndex - 1);
            items[size - 1] = null;
            size--;
        }
        System.out.println(items.length);
        return result;
    }
}