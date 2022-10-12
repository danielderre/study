package application;
import entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Product name: ");
        String name = sc.nextLine();

        System.out.println("Product price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product);
        System.out.println("Enter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.addProducts(quantityToAdd);
        System.out.println(product);

        System.out.println("Enter the number of products to be removed from stock: ");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove);
        System.out.println(product);
    }
}