package seedu.duke; // ??

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<ShoppingListItem> items;

    public ShoppingList() {
        items = new ArrayList<>();
    }

    // Add a new item to the shopping list.
    public void addItem(ShoppingListItem item) {
        items.add(item);
    }

    // Get the list of shopping items.
    public List<ShoppingListItem> getItems() {
        return items;
    }

    // Remove an item by ingredient name.
    public boolean removeItem(String ingredientName) {
        return items.removeIf(item -> item.getIngredientName().equalsIgnoreCase(ingredientName));
    }
}
