import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to add: ");
        int addQty = sc.nextInt();
        product.addProducts(addQty);

        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to remove: ");
        int removeQty = sc.nextInt();
        product.removeProducts(removeQty);

        System.out.println("Updated data: " + product);
    }
}