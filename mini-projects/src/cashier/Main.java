package cashier;
import cashier.product.DiscountedProduct;
import cashier.product.Product;
import cashier.product.ProductCatalog;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create product catalog
        ProductCatalog catalog = new ProductCatalog();
        
        // Add some products to the catalog
        catalog.addProduct(new Product("P001", "Milk", 2.99));
        catalog.addProduct(new Product("P002", "Bread", 1.99));
        catalog.addProduct(new DiscountedProduct("P003", "Soda", 1.50, 10));
        catalog.addProduct(new Product("P004", "Eggs", 3.49));
        
        // Initialize cashier with the catalog
        Cashier cashier = new Cashier(catalog);
        
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Available Products:");
        System.out.println("-------------------");
        System.out.println("P001 - Milk - $2.99");
        System.out.println("P002 - Bread - $1.99");
        System.out.println("P003 - Soda - $1.50 (10% discount)");
        System.out.println("P004 - Eggs - $3.49");
        
        System.out.println();
        System.out.println("Enter product IDs (one per line, empty to finish):");
        
        // Get product selections
        while (true) {
            System.out.print("Product ID: ");
            String productId = scanner.nextLine();
            
            if (productId.isEmpty()) {
                break;
            }
            
            cashier.selectProduct(productId);
        }
        
        // Perform checkout
        System.out.println();
        System.out.println("Starting checkout...");
        cashier.checkout();
        
        scanner.close();
    }
}