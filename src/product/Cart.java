package product;

import java.util.List;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        return 0;
    }
}
