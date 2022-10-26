package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case",80.95));

        for (Product p : list) {
            System.out.println(p);
        }
        System.out.println("---------------------");
        // Using interface -> price >= 100
        list.removeIf(new ProductPredicate());

        for (Product p : list) {
            System.out.println(p);
        }
        System.out.println("---------------------");
        // using non-static reference method -> price >= 75
        list.removeIf(Product::ProductPredicate);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}