package weekelyAssignment1;

import java.util.Arrays;
import java.util.List;

class Product {
    int id;
    String productName;
    double price;

    public Product(int id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", productName='" + productName + "', price=" + price + "}";
    }
}

public class SortExpensiveProduct_15_05 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 1200.00),
            new Product(2, "Mouse", 25.00),
            new Product(3, "Monitor", 350.00),
            new Product(4, "Smartphone", 1050.00)
        );

        // 1. Use filter() & 2. Use toList()
        List<Product> expensiveProducts = products.stream()
                .filter(p -> p.price > 1000)
                .toList(); // For older Java versions, use .collect(java.util.stream.Collectors.toList())

        // 3. Print final list
        expensiveProducts.forEach(System.out::println);
    }
}

