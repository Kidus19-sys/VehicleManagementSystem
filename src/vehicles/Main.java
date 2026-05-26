package vehicles;

public class Main {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Vehicle v1 = new Car("Toyota", 180, 4);
        Vehicle v2 = new Bike("Yamaha", 120, true);
        Vehicle v3 = new Truck("Volvo", 100, 10);

        // Calling overridden methods
        v1.displayInfo();
        System.out.println();

        v2.displayInfo();
        System.out.println();

        v3.displayInfo();
        System.out.println();

        // Common methods
        v1.start();
        v2.start();
        v3.start();
    }
}