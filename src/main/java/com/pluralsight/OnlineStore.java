package com.pluralsight;
import java.util.*;
import java.io.*;

public class OnlineStore {
    public static HashMap<String, Products> productList = new HashMap<String, Products>();

    public static void main(String[] args) {
        loadProducts();


    }

    public static void loadProducts() {
        try {
            BufferedReader bufRead = new BufferedReader(new FileReader("src/main/resources/products.csv"));
            String csv;
            while ((csv = bufRead.readLine()) != null) {
                String[] Inventory = csv.split("\\|");
                String sku = Inventory[0];
                String productName = Inventory[1];
                float price = Float.parseFloat(Inventory[2]);
                String department = Inventory[3];
                //*** Products
                productList.put(sku, new Products(sku, productName, price, department));
            }

        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public static void homeScreen() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("What item are you interested in? ");
            String userSearch = scanner.next();
            Products matchedProduct = productList.get(userSearch);
            if (matchedProduct == null) {
                System.out.println("We don't carry that product");
                return;
            }
            System.out.printf("We carry %s and the price is $%.2f. ",
                    matchedProduct.getProductName(), matchedProduct.getPrice());

            System.out.println("\n Would you like to view another product? (Y/N)");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public static void














}


























}



