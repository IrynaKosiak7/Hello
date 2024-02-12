package org.example.example_06_02.Task2;

public class Category {
    private String name;
    private Item[] items;

    public Category(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }
}
