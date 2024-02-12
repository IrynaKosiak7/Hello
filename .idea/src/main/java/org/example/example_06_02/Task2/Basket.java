package org.example.example_06_02.Task2;

public class Basket {
    private Item[] selectedItems;

    public Basket(Item[] selectedItems) {
        this.selectedItems = selectedItems;
    }

    public Item[] getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(Item[] selectedItems) {
        this.selectedItems = selectedItems;
    }
}
