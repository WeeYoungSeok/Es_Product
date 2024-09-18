import product.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", new BigDecimal("30000"), 2d);
        Product grocery = new Grocery("grocery", new BigDecimal("20000"), 3d);
        Product largeAppliance = new LargeAppliance("largeAppliance", new BigDecimal("50000"), 5d);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);    // 결과: 9000
    }
}