import java.util.HashSet;
import java.util.Set;

import static com.sun.tools.javac.util.Assert.check;

public class Product <A> {
    private String title;//название
    private double price;//цена
    private int quantity;//количество, кг
    private Set<Product> product;

    public Set<Product> getProduct() {
        return product;
    }

    public Product(Set<Product> product) {
        this.product = product;
    }

    Set<String> set = new HashSet<>();


    public void addTitle() {
        set.add(title);
    }

    public void purchasedTitle() {
        System.out.println("Товар куплен");
    }

    public void removeTitle() {
        set.remove(title);
    }

    public Product(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        try {
            check(getTitle() == null, price = 0, quantity = 0);
        } catch (Exception e) {
            System.out.println("Заполните карточку товара полностью");
        }
    }

    private void check(boolean b, double v, int i) {

    }

//    public Product(Set<String> set) {
//        this.set = set;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Set<String> getSet() {
        return set;
    }
}

