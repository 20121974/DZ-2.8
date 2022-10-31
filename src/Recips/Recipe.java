package Recips;

import Products.Product;
import jdk.internal.jimage.ImageStrings;

import java.util.*;

public class Recipe {
    private String nameOfRecipe;//Название рецепта
    private final Set<Product> productsList = new HashSet<>();
    //private Map<Products.Product, Integer> recipe = new HashMap<>();
    private int totalCostRecipe;// Суммарная стоимость всех продуктов у данного рецепта


    public Recipe(String nameOfRecipe, ImageStrings recipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.totalCostRecipe = 0;
        recipe.add(String.valueOf(this));
    }
    public void addProductOfRecipe(Product product, int requiredQuantity){
        if (product.contains(product)){
            throw new RuntimeException("Продукт уже добавлен в рецепт!");
        }
        product.add(product);
        totalCostRecipe = totalCostRecipe + product.getPrice() * requiredQuantity;//требуемое количество
    }
    @Override
    public String toString() {
        return "Recips.Recipe{" +
                "nameOfRecipe='" + nameOfRecipe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return totalCostRecipe == recipe.totalCostRecipe && nameOfRecipe.equals(recipe.nameOfRecipe) && productsList.equals(recipe.productsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, productsList, totalCostRecipe);
    }

    public double getTotalCostRecipe() {//общая стоимость продуктов в этом рецепте
        return totalCostRecipe;
    }

    public Set<Product> getProductsList() {
        return productsList;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }
}
