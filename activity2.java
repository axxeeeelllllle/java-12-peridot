
public class activity2 {
    public static void main(String[] args) {
        String item = "Laptop";
        int quantity = 2;
        float price = 799.99f;
        char currency = '$';
        boolean inStock = true;

        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + currency + price);
        System.out.println("In stock: " + inStock);

        float total = quantity * price;
        System.out.println("Total cost: " + currency + total);

        if (inStock) {
            System.out.println(item + " is available for purchase.");
        } else {
            System.out.println(item + " is currently out of stock.");
        }
    }
}
