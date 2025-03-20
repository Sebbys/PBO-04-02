package cashier.product;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product findProductById(String id) {
        return products.get(id);
    }
}