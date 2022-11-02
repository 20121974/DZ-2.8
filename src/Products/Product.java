package Products;

import java.util.Objects;

import static com.sun.tools.javac.util.Assert.check;

public class Product {
    private String name;//название
    private int price;
    private final int count;//количество, кг

    public Product(String name, int price, int count) {
        this.count = count;
        if (name != null && !name.isBlank() && !name.isEmpty() && price > 0) {
            this.name = name;
            this.price = price;
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
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
    public String getName() {
        return name;
    }
    public void add(Product product) {
    }

}

