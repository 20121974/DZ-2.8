package Products;

import Products.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    //private String lotsOfProducts;//Множество продуктов
    public static Set<Product> productsList = new HashSet<>();

    public static void printListOfProduct() {
        System.out.printf("Список продуктов:");
        for (Product product : productsList) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб");
        }
    }
    public static void  addProductToList(Product newProduct){
        if (!productsList.add(newProduct)){
            throw new RuntimeException("Такой продукт уже есть");
        }
    }
}
