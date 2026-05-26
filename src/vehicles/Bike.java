package vehicles;

public class Bike extends Vehicle {

    private boolean hasHelmet;

    public Bike(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void displayInfo() {

        System.out.println("=== Bike Information ===");
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Helmet Included: " + hasHelmet);
    }
}