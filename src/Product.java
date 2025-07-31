public class Product {
    private final String name;
    private final double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        if (quantity > this.quantity) {
            System.out.println("Error: quantity to remove exceeds the stock.");
        } else {
            this.quantity -= quantity;
        }
    }

    @Override
    public String toString() {
        return  this.name + ", $ "
                + String.format("%.2f", this.price) + ", "
                + this.quantity + " units, " + "total: "
                + String.format("%.2f", totalValueInStock());
    }
}
