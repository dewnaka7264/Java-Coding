import java.util.ArrayList;

public class ElectronicsExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store Electronics objects
        ArrayList<Electronics> electronicsList = new ArrayList<>();

        // Adding 5 similar Electronics objects to the ArrayList
        for (int i = 1; i <= 5; i++) {
            Electronics electronicItem = new Electronics("Brand" , "Model");
            electronicsList.add(electronicItem);
        }

        // Displaying the contents of the ArrayList
        for (Electronics item : electronicsList) {
            System.out.println(item);
        }
    }
}

class Electronics {
    private String brand;
    private String model;

    public Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
