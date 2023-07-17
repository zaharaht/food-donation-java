package models;

import models.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class Receiver {
    private String name;
    private List<FoodItem> receivedItems;

    public Receiver(String name) {
        this.name = name;
        this.receivedItems = new ArrayList<>();
    }

    public void receiveFoodItem(FoodItem item) {
        receivedItems.add(item);
    }

    public List<FoodItem> getReceivedItems() {
        return receivedItems;
    }

    public String getName() {
        return name;
    }
}