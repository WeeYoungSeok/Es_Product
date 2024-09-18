package product;

import java.math.BigDecimal;

public class Beauty extends Product {

    Beauty (String name, BigDecimal price, Double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
