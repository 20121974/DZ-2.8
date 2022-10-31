package Recips;

import java.util.HashSet;
import java.util.Set;

public class RecipeCollection {

    public static Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Recipe recipe){
        for (var recipeInCollection:recipes) {
            if (recipeInCollection.getNameOfRecipe().equals(recipe.getNameOfRecipe())) {
                throw new RuntimeException("Такой рецепт уже есть");
            }
        }
        recipes.add(recipe);
    }

    public static void printAllRecipes(){
        System.out.println("Книга рецептов");
        for (Recipe recipe:recipes){
            System.out.print(recipe.getNameOfRecipe() + ": ");
        System.out.println("Общая стоимость продуктов" + recipe.getTotalCostRecipe() + " руб");}
    }
}
