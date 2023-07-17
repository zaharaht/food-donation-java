package models;

import java.util.ArrayList;
import java.util.List;

public class Donor {
    private String name;
    private List<FoodItem> donatedItems;

    public Donor(String name) {
        this.name = name;
        this.donatedItems = new ArrayList<>();
    }

    public void donateFoodItem(String itemName) {
        FoodItem foodItem = new FoodItem(itemName);
        donatedItems.add(foodItem);
    }

    public List<FoodItem> getDonatedItems() {
        return donatedItems;
    }

    public String getName() {
        return name;
    }
}
