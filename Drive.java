package Inheritance;

//Main class with main method to execute the program
public class Drive 
{
 public static void main(String[] args) 
 {
     // Instantiate Car and Bike objects
     Car car = new Car("Toyota", "Camry", 2020, 180);
     Bike bike = new Bike("Yamaha", "YZF-R3", 2019, 160);

     // Print the attributes of Car and Bike
     System.out.println("Car Details:");
     System.out.println("Make: " + car.make);
     System.out.println("Model: " + car.model);
     System.out.println("Year: " + car.year);
     System.out.println("Max Speed: " + car.maximumSpeed + " km/h");
     car.drive();

     System.out.println("\nBike Details:");
     System.out.println("Make: " + bike.make);
     System.out.println("Model: " + bike.model);
     System.out.println("Year: " + bike.year);
     System.out.println("Max Speed: " + bike.maximumSpeed + " km/h");
     bike.drive();
 }
}

//Vehicle class with attributes and drive() method
class Vehicle 
{
 String make;
 String model;
 int year;
 int maximumSpeed;

 // Constructor for Vehicle class
 public Vehicle(String make, String model, int year, int maximumSpeed) 
 {
     this.make = make;
     this.model = model;
     this.year = year;
     this.maximumSpeed = maximumSpeed;
 }

 // Method to be overridden in subclasses
 public void drive() 
 {
     System.out.println("Vehicle is driving.");
 }
}

//Car subclass extending Vehicle
class Car extends Vehicle 
{
 // Constructor for Car subclass
 public Car(String make, String model, int year, int maximumSpeed) 
 {
     super(make, model, year, maximumSpeed);
 }

 // Overriding drive() method
 @Override
 public void drive() 
 {
     System.out.println(make + " " + model + " Car is driving.");
 }
}

//Bike subclass extending Vehicle
class Bike extends Vehicle 
{
 // Constructor for Bike subclass
 public Bike(String make, String model, int year, int maximumSpeed) 
 {
     super(make, model, year, maximumSpeed);
 }

 // Overriding drive() method
 @Override
 public void drive() 
 {
     System.out.println(make + " " + model + " Bike is driving.");
 }
}