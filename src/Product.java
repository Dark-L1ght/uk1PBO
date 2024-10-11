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
}

//Child Class Electronics
class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(int id, String name, double price) {
        super(id, name, price);
        this.brand = "Generic";
        this.warrantyPeriod = 1;
    }

    // Overloading untuk menambah brand dan garansi
    public Electronics(int id, String name, double price, String brand, int warrantyPeriod) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    //Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Overriding untuk menampilkan info spesifik elektronik
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand + ", Warranty Period: " + warrantyPeriod + " year(s)");
    }

    //Menampilkan periode garansi
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

}

//Child Class Clothing
class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(int id, String name, double price, String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    //Setter and Getter
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size + ", Material: " + material);
    }

}

class Furniture extends Product {
    private String material;
    private String dimensions;

    public Furniture(int id, String name, double price, String material, String dimensions) {
        super(id, name, price);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Material: " + material + ", Dimensions: " + dimensions);
    }

}