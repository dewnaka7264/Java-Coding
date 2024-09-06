package OOPCW;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization {

    public static void main(String[] args) {
        // Sample list of products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 999.99));
        productList.add(new Product("Smartphone", 499.99));
        productList.add(new Product("Headphones", 79.99));

        // Specify the file path where you want to save the data
        String filePath = "products.ser";

        // Serialize and save the list of products to the file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(productList);
            System.out.println("Product list saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and load the list of products from the file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            List<Product> loadedProductList = (List<Product>) inputStream.readObject();
            System.out.println("Loaded product list: " + loadedProductList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Sample class for product serialization
class Product implements Serializable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
