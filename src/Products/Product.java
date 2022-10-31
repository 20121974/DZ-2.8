package Products;

import java.util.Objects;

import static com.sun.tools.javac.util.Assert.check;

public class Product {
    private final String name;//название
    private final int price;
    private final int count;//количество, кг

    public Product(String name, int price, int count) {
        this.count = count;
        if (name != null && !name.isBlank() && !name.isEmpty() && price > 0) {
            this.name = name;
            this.price = price;
            ProductList.addProductToList(this);
        } else {
            throw new RuntimeException("Заполните карточку товара" + name + " корректно!");
        }
    }

    @Override
    public String toString() {
        return "Products.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public boolean contains(Product product) {
        return false;
    }

    public void add(Product product) {
    }

//    HashMap<String, Integer> map = new HashMap <>();

//    public void purchasedTitle() {//приобрести продукты
//        System.out.println("Товар куплен");
//    }
//    public void keySet (){//все продукты
//        map.keySet();
//    }//все ключи
//    private void check(boolean b, double v, int i) {
//    }
//        this.quantity = quantity;
//        try {
//            check(getTitle() == null, price = null, quantity = 0);
//        } catch (Exception e) {
//            System.out.println("Заполните карточку товара полностью");
//        }
//    private void addProductToList(Products.Product product) {
//  }



}

