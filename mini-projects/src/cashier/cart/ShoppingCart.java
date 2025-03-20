package cashier.cart;
import java.util.ArrayList;
import java.util.List;
import cashier.product.Product; // adjust accordingly

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        return items.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}