import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.sun.tools.javac.util.Assert.check;

public class Product {
    protected static Double price;
    protected String title;//название

    private int quantity;//количество, кг
    HashMap<String, Double> map = new HashMap <>();



    public void purchasedTitle() {//приобрести продукты
        System.out.println("Товар куплен");
    }
    public void keySet (){//все продукты
        map.keySet();
    }//все ключи

    public Product() {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        try {
            check(getTitle() == null, price = null, quantity = 0);
        } catch (Exception e) {
            System.out.println("Заполните карточку товара полностью");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && title.equals(product.title) && map.equals(product.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, quantity, map);
    }

    private void check(boolean b, double v, int i) {

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMap(Set<String> set) {
        this.map = map;
    }

    public static String getTitle() {
        return getTitle();
    }

    public double getPrice() {
        return price;
    }

    public static int getQuantity() {
        return getQuantity();
    }

}

