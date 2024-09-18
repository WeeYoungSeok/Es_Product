package product;

import event.Promotion;

public class Product implements Promotion {
    String name;
    int price;
    int weight;

    public Product() {
    }

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
