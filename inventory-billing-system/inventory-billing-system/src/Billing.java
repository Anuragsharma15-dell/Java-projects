import java.time.LocalDateTime;
import java.util.*;

public class Billing {
    public static void main(String[] args) {
        
    }

    private ArrayList<String> items = new ArrayList<>();
    private double total = 0;

    public void addItem(Product p, int qty) {
        if (qty > p.getQuantity()) {
            System.out.println("❌ Not enough stock!");
            return;
        }

        double cost = p.getPrice() * qty;
        items.add(p.getName() + " x" + qty + " -> Rs." + cost);
        total += cost;

        // reduce stock
        p.setQuantity(p.getQuantity() - qty);
    }

    public Transaction generateBill() {
        System.out.println("\n--- BILL GENERATED ---");
        for (String i : items) System.out.println(i);
        System.out.println("Total: Rs." + total);

        return new Transaction(LocalDateTime.now(), total, items);
    }
}
