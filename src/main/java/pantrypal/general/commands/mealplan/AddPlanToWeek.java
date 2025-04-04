package pantrypal.general.commands.mealplan;

import pantrypal.general.control.Ui;
import pantrypal.inventory.IngredientInventory;
import pantrypal.mealplan.MealPlanManager;
import pantrypal.recipe.RecipeManager;
import pantrypal.shoppinglist.ShoppingList;

import java.util.Scanner;

public class AddPlanToWeek extends MealPlanCommand {

    private int planIndex;
    private String day;

    public AddPlanToWeek() {
        super("addPlanToList <plan name>", "Add a new plan to the list");
    }

    public AddPlanToWeek(int planIndex, String day) {
        this.planIndex = planIndex;
        this.day = day;
    }

    @Override
    public void execute(Ui ui, IngredientInventory inventory, ShoppingList list,RecipeManager recipes,
                        MealPlanManager plans, Scanner in){
        try {
            plans.addPlanToWeek(planIndex, getDay(day));
        } catch (NullPointerException e) {
            Ui.showMessage("Invalid day index provided. Please enter a valid day name.");
        } catch (IllegalArgumentException e) {
            Ui.showMessage("Invalid plan index provided. Please enter a valid plan index.");
        }
    }
}
