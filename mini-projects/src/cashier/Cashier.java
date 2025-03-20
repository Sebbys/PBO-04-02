package cashier;
import cashier.cart.ShoppingCart;
import cashier.product.Product;
import cashier.product.ProductCatalog;

public class Cashier {
    private ShoppingCart cart;
    private ProductCatalog catalog;

    public Cashier(ProductCatalog catalog) {
        this.cart = new ShoppingCart();
        this.catalog = catalog;
    }

    public void selectProduct(String productId) {
        Product product = catalog.findProductById(productId);
        if (product != null) {
            cart.addItem(product);
        }
    }

    public void checkout() {
        System.out.printf("Total: $%.2f%n", cart.calculateTotal());
    }
}