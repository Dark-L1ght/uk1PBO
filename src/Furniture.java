//Child Class Furniture
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