//Child Class Electronics
class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    // Overloading untuk menambah brand dan garansi
    public Electronics(int id, String name, double price, String brand, int warrantyPeriod) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public Electronics(int id, String name, double price) {
        super(id, name, price);
        this.brand = "Generic";
        this.warrantyPeriod = 1;
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