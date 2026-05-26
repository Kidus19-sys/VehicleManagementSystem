package vehicles;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String brand, int speed, double loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {

        System.out.println("=== Truck Information ===");
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}