package product;

import event.Promotion;

import java.math.BigDecimal;

public class Product implements Promotion {
    private String name;
    private BigDecimal price;
    private Double weight;

    public Product() {
    }

    public Product(String name, BigDecimal price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
