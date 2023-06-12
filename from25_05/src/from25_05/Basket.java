package from25_05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;
    private LocalDate purchaseDate;

    public Basket() {
        products = new ArrayList<>();
        purchaseDate = LocalDate.now();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printPurchaseReport() {
        System.out.println("Отчет о покупке:");
        System.out.println("Дата покупки: " + purchaseDate);

        for (Product product : products) {
            System.out.println("Товар: " + product.getName());
            System.out.println("Цена: " + product.getPrice());
            // Дополнительная информация о товаре
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Basket basket = new Basket();

        Product product1 = new Product("Мышка", 15.99);
        Product product2 = new Product("Клавиатура", 29.99);

        basket.addProduct(product1);
        basket.addProduct(product2);

        basket.printPurchaseReport();
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
