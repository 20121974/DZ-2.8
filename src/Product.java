import java.util.HashMap;
import java.util.Set;

import static com.sun.tools.javac.util.Assert.check;

public class Product <A> {
    private String title;//название
    private double price;//цена
    private int quantity;//количество, кг
    HashMap<String, Double> map = new HashMap <>();

    public void putTitle() {//добавить продукт
        if (price >= 1){
        map.put(title, price);}
    }

    public void purchasedTitle() {//приобрести продукты
        System.out.println("Товар куплен");
    }
    public void keySet (){//все продукты
        map.keySet();
    }//все ключи
    public void values (){//все количество продуктов
        map.values();
    }
    public void removeTitle() {
        map.remove(title);
    }//удалить продукты

    public Product() {
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

