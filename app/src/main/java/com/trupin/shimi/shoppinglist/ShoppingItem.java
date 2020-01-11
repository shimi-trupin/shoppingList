package com.trupin.shimi.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingItem {
    private String name;
    private Boolean isChecked;
    private String description;

    public ShoppingItem(String name, Boolean isChecked, String description) {
        this.name = name;
        this.isChecked = isChecked;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public String getDescription() {
        return description;
    }

    private static int lastShoppingItemId = 0;

    public static List<ShoppingItem> createDummyShoppingListItem(int listSize) {
        List<ShoppingItem> shoppingItemList = new ArrayList<>();
        Random random = new Random(2);

        for (int i = 0; i < listSize; i++) {
            shoppingItemList.add(new ShoppingItem("Item " + ++lastShoppingItemId, random.nextBoolean(), "Default description"));
        }

        return shoppingItemList;
    }
}
