package Recips;

import Products.Product;
import jdk.internal.jimage.ImageStrings;

import java.util.*;

public class Recipe {
    private String nameOfRecipe;//Название рецепта
    //private final Set<Product> productsList = new HashSet<>();
    private final Map<Product, Integer> products = new HashMap<>();
    private int totalCostRecipe;// Суммарная стоимость всех продуктов у данного рецепта


    public Recipe(String nameOfRecipe, ImageStrings recipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.totalCostRecipe = 0;
        recipe.add(String.valueOf(this));
    }
    public void addProductOfRecipe(Product product, int requiredQuantity){
        if (products.containsKey(product)){
            throw new RuntimeException("Продукт уже добавлен в рецепт!");
        }
        products.put(product, requiredQuantity);
        //totalCostRecipe = totalCostRecipe + product.getPrice() * requiredQuantity;//требуемое количество
    }
    public  int getCostForProduct(){
        int sum = 0;
        for (Product key : products.keySet()) {
            sum += products.get(key) * key.getPrice();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "Recipes.Recipe{" +
                "nameOfRecipe='" + nameOfRecipe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return totalCostRecipe == recipe.totalCostRecipe && nameOfRecipe.equals(recipe.nameOfRecipe) && products.equals(recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, products, totalCostRecipe);
    }

    public double getTotalCostRecipe() {//общая стоимость продуктов в этом рецепте
        return totalCostRecipe;
    }



    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
