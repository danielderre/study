package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();


        System.out.println("Enter file path: ");
        String sourceStrPath = sc.nextLine();

        File sourceFile = new File(sourceStrPath);
        boolean success = new File(sourceFile.getParent() + "\\out").mkdir();
        System.out.println("Output folder created: " + success);
        String targetStrPath = sourceFile.getParent() + "/out/productsSummary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile)))  {
            String csvLine = br.readLine();

            while (csvLine != null) {
                System.out.println(csvLine);

                String[] csvData = csvLine.split(",");
                String name = csvData[0];
                double price = Double.parseDouble(csvData[1]);
                int quantity = Integer.parseInt(csvData[2]);

                productList.add(new Product(name,price,quantity));
                csvLine = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetStrPath))){
                for (Product prod : productList) {
                    bw.write(prod.getName() + "," + String.format("%.2f",prod.totalPrice()));
                    bw.newLine();
                }
                System.out.println(targetStrPath + " created successfully!");
            } catch (IOException e){
                System.out.println("Cannot write file" + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error while getting file: " + e.getMessage());
        }
    }
}