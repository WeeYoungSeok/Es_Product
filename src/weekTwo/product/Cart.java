package weekTwo.product;

import weekTwo.delivery.DeliveryChargeCalculator;

import java.math.BigDecimal;

public class Cart implements DeliveryChargeCalculator {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }
    @Override
    public BigDecimal getDeliveryCharge(Double weight, BigDecimal price) {
        BigDecimal deliveryAmount;
        if (weight < 3d) {
            deliveryAmount = new BigDecimal("1000");
        } else if (weight >= 3d && weight < 10d) {
            deliveryAmount = new BigDecimal("5000");
        } else {
            deliveryAmount = new BigDecimal("10000");
        }

        BigDecimal deliveryCharge;
        if (price.compareTo(new BigDecimal("30000")) < 0) {
            deliveryCharge = new BigDecimal("0");
        } else if (price.compareTo(new BigDecimal("30000")) >= 0 &&
        price.compareTo(new BigDecimal("100000")) < 0) {
            deliveryCharge = new BigDecimal("1000");
        } else {
            deliveryCharge = deliveryAmount;
        }

        return deliveryAmount.subtract(deliveryCharge);
    }

    public int calculateDeliveryCharge() {
        BigDecimal totalCharge = BigDecimal.ZERO;

        // 모든 제품의 배송 요금을 합산
        for (Product product : products) {
            totalCharge = totalCharge.add(getDeliveryCharge(product.getWeight(), product.getPrice()));
        }

        return totalCharge.intValue();
    }

}
