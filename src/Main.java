public class Main {
    public static void main(String[] args) {
        Electronics phone = new Electronics(1, "Smartphone", 699.99, "Samsung", 2);
        Clothing tshirt = new Clothing(2, "T-Shirt", 19.99, "M", "Cotton");
        Furniture sofa = new Furniture(3, "Sofa", 299.99, "Leather", "84 x 35 x 30 inches");

        // Displaying details for each product
        System.out.println("Electronics Product Details:");
        phone.displayDetails();
        System.out.println("\nClothing Product Details:");
        tshirt.displayDetails();
        System.out.println("\nFurniture Product Details:");
        sofa.displayDetails();
    }
}