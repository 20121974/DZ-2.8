public class LotsOfProducts extends Product {//множество продуктов
    public void putTitle() {//добавить продукт
        if (Product.price >= 1){
            map.put(title, price);}
    }
}
