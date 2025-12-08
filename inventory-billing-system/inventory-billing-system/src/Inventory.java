import java.util.*;
import java.lang.*;


public class Inventory {
     public static void main(String[] args) {
        
     }

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("✔ Product added successfully!");
    }

    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
        System.out.println("✔ Product deleted!");
    }

    public void updateQuantity(int id, int newQty) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setQuantity(newQty);
                System.out.println("✔ Quantity updated!");
                return;
            }
        }
        System.out.println("❌ Product not found!");
    }

    public void listProducts() {
        System.out.println("\n--- All Products ---");
        for (Product p : products) System.out.println(p);
    }


    public Product searchProduct(int id) {
        for (Product p : products)
            if (p.getId() == id) return p;
        return null;
    }

    

    public ArrayList<Product> getAll() {
        return products;
    }
}
