package models;

import models.Donor;
import models.FoodItem;
import models.Receiver;

import java.util.ArrayList;
import java.util.List;

class CollectionCenter {
    private String name;
    private List<Receiver> receivers;

    public CollectionCenter(String name) {
        this.name = name;
        this.receivers = new ArrayList<>();
    }

    public void addReceiver(Receiver receiver) {
        receivers.add(receiver);
    }

    public void collectFoodItems(Donor donor) {
        List<FoodItem> donatedItems = donor.getDonatedItems();
        for (Receiver receiver : receivers) {
            for (FoodItem item : donatedItems) {
                receiver.receiveFoodItem(item);
            }

        }
    }
}
