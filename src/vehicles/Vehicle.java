package vehicles;

public class Vehicle {

    // Encapsulation
    private String brand;
    private int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getter
    public String getBrand() {
        return brand;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >= 0) {
            this.speed = speed;
        }
    }

    // Methods
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Compile-time Polymorphism (Method Overloading)
    public void start(String mode) {
        System.out.println("Vehicle is starting in " + mode + " mode...");
    }



    public void stop() {
        System.out.println(brand + " is stopping...");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}