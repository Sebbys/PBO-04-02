package cashier.product;

public class DiscountedProduct extends Product {
    private double discountPercentage;

    public DiscountedProduct(String id, String name, double price, double discountPercentage) {
        super(id, name, price);
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscountedPrice() {
        return super.getPrice() * (1 - discountPercentage/100);
    }

    @Override
    public double getPrice() {
        return calculateDiscountedPrice();
    }
}
