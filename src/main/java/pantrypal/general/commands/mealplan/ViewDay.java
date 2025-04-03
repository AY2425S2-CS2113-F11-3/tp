package pantrypal.general.commands.mealplan;

import pantrypal.general.control.Ui;
import pantrypal.inventory.IngredientInventory;
import pantrypal.mealplan.PlanPresets;
import pantrypal.mealplan.WeeklySchedule;
import pantrypal.recipe.RecipeManager;
import pantrypal.shoppinglist.ShoppingList;

import java.util.Scanner;

public class ViewDay extends MealPlanCommand {
    private int dayIndex;

    public ViewDay() {
        super("viewDay <dayIndex>", "View Details Of Current Day");
    }

    public ViewDay(int dayIndex) {
        this.dayIndex = dayIndex;
    }

    @Override
    public void execute(Ui ui, IngredientInventory inventory, ShoppingList list, PlanPresets presets,
                        RecipeManager recipes, WeeklySchedule week, Scanner in) {

        week.viewDay(dayIndex);

    }
}
