package product;

import event.Promotion;

public class Product implements Promotion {
    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
