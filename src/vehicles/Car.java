package vehicles;

public class Car extends Vehicle {

    private int doors;
    public Car(String brand, int speed, int doors) {
        super(brand, speed );
        this.doors = doors;

    }

    // Method Overriding
    @Override
    public void displayInfo() {

        System.out.println("=== Car Information ===");
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Doors: " + doors);

    }
}
