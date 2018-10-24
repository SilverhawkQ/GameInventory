package gameinventory;

public class model {

    //global variables
    private String name, description;
    private double price;
    private int quantity;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        description = d;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int q) {
        quantity = q;
    }

    @Override
    public String toString() {
        return "game{" + "name=" + name + ", description=" + description + ", price=" + price + '}';
    }
}
