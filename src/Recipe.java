import jdk.internal.jimage.ImageStrings;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String lotsOfProducts;//Множество продуктов
    private double totalCostOfAllProductsInThisRecipe;// Суммарная стоимость всех продуктов у данного рецепта
    private String nameOfTheRecipe;//Название рецепта
    private Set<Recipe> recipes;

    public Set<Recipe> getRecipes() {
        return recipes;
    }
    public void addRecipe(ImageStrings set) {
        set.add(recipes.toString());
    }
    public Recipe(String lotsOfProducts, double totalCostOfAllProductsInThisRecipe, String nameOfTheRecipe) {
        this.lotsOfProducts = lotsOfProducts;
        this.totalCostOfAllProductsInThisRecipe = totalCostOfAllProductsInThisRecipe;
        this.nameOfTheRecipe = nameOfTheRecipe;
        recipes = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.totalCostOfAllProductsInThisRecipe, totalCostOfAllProductsInThisRecipe) == 0
                && lotsOfProducts.equals(recipe.lotsOfProducts) && nameOfTheRecipe.equals(recipe.nameOfTheRecipe)
                && recipes.equals(recipe.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lotsOfProducts, totalCostOfAllProductsInThisRecipe, nameOfTheRecipe, recipes);
    }

    public String getLotsOfProducts() {
        return lotsOfProducts;
    }

    public double getTotalCostOfAllProductsInThisRecipe() {
        return totalCostOfAllProductsInThisRecipe;
    }

    public String getNameOfTheRecipe() {
        return nameOfTheRecipe;
    }
}
