package ecommerce;

public class Search {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Phone", "Electronics"),
            new Product(150, "Shoes", "Fashion"),
            new Product(120, "Watch", "Accessories")
        };

        int targetId = 150;

        // Linear Search 
        Product foundLinear = LinearSearch.searchById(products, targetId);
        if (foundLinear != null) {
            System.out.println("Found with Linear Search: " + foundLinear.getProductName());
        } else {
            System.out.println("Product not found with Linear Search.");
        }

        // Binary Search
        Product foundBinary = BinarySearch.searchById(products, targetId);
        if (foundBinary != null) {
            System.out.println("Found with Binary Search: " + foundBinary.getProductName());
        } else {
            System.out.println("Product not found with Binary Search.");
        }
    }
}