package models;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class FoodItem {
    private String name;
    private int quantity;

    public FoodItem(String name) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }
}




