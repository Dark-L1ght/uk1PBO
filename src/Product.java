public class Product {
    private int id;
    private String name;
    private double price;

    //Setter and Getter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Method untuk menampilkan product
    public void displayDetails() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: $" + price);
    }

    //displayDetails yang di Overload untuk menampilan harga secara optional
    public void displayDetails(boolean showPrice) {
        if (showPrice) {
            displayDetails(); // panggil method asli
        } else {
            System.out.println("Product ID: " + id + ", Name: " + name);
        }
    }
}