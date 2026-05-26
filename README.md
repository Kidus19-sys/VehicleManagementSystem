# Vehicle Management System

## Project Description

This project is a simple console-based Java application developed as a Minimum Viable Product (MVP) to demonstrate the core Object-Oriented Programming (OOP) concepts learned in class.

The system models different types of vehicles such as Cars, Bikes, and Trucks using inheritance and polymorphism.

---

# Features

* Create different vehicle objects
* Display vehicle information
* Start vehicles
* Stop vehicles
* Demonstrate inheritance and polymorphism

---

# Technologies Used

* Java
* IntelliJ IDEA (or any Java IDE)

---

# Project Structure

```text
src/
│
├── Vehicle.java
├── Car.java
├── Bike.java
├── Truck.java
├── Main.java
```

---

# OOP Concepts Demonstrated

## 1. Classes and Objects

Classes:

* Vehicle
* Car
* Bike
* Truck

Objects are created in:

* Main.java

Example:

```java
Vehicle v1 = new Car("Toyota", 180, 4);
```

---

## 2. Encapsulation

Private fields are used inside the Vehicle class.

Example:

```java
private String brand;
private int speed;
```

Getters and setters are implemented:

```java
public String getBrand()
public void setBrand(String brand)
```

File:

* Vehicle.java

---

## 3. Inheritance

Child classes inherit from the Vehicle superclass.

Example:

```java
public class Car extends Vehicle
```

Files:

* Car.java
* Bike.java
* Truck.java

---

## 4. Polymorphism

### Method Overriding (Runtime Polymorphism)

Each child class overrides the displayInfo() method.

Example:

```java
@Override
public void displayInfo()
```

Files:

* Car.java
* Bike.java
* Truck.java

---

### Method Overloading (Compile-time Polymorphism)

The start() method is overloaded in Vehicle.java.

Example:

```java
public void start()
public void start(String mode)
```

---

### Superclass References

Superclass references are used to store subclass objects dynamically.

Example:

```java
Vehicle v1 = new Car("Toyota", 180, 4);
```

File:

* Main.java

---

# How to Compile and Run

## Using IntelliJ IDEA

1. Open the project
2. Open Main.java
3. Click the Run button

---

## Using Terminal

Compile:

```bash
javac vehicles/*.java
```

Run:

```bash
java vehicles.Main
```

---

# Sample Output

```text
=== Car Information ===
Brand: Toyota
Speed: 180
Doors: 4

=== Bike Information ===
Brand: Yamaha
Speed: 120
Helmet Included: true

=== Truck Information ===
Brand: Volvo
Speed: 100
Load Capacity: 10.0 tons

Toyota is starting...
Yamaha is starting...
Volvo is starting...
```

---

# Authors

* Your Name
* Partner Name (if any)

---

# Conclusion

This project successfully demonstrates the fundamental Object-Oriented Programming concepts in Java including:

* Encapsulation
* Inheritance
* Polymorphism
* Classes and Objects
* Method Overriding
* Method Overloading
