class Vehicle//Base class
{
	String make; 
	String model;
	int year;
	int maximumspeed;
	
	//Constructor for vehicle class
public Vehicle(String make,String model,int year,int maximumspeed)
{
	this.make = make;
	this.model = model;
	this.year = year;
	this.maximumspeed = maximumspeed;
}
//method to be overridden
public void drive()
{
	System.out.println("Vehicle is driving...");
}

//method to display vehicle attributes
public void displayAttributes()
{
	System.out.println("\nMake: " + make + " Model: " + model + " Year: " + year + " MaxSpeed: " + maximumspeed);
}
}
//Subclass Car
class Car extends Vehicle
{
	//constructor for Car class, calling super()
	public Car(String make,String model,int year,int maximumspeed)
	{
		super(make, model, year, maximumspeed);
	}
	
	//overriding drive() method
	public void drive()
	{
		System.out.println(make + "" + model + "Car is Driving..");
	}
}
//subclass Bike
class Bike extends Vehicle
{
	//constructor for Bike class, calling super()
	public Bike(String make,String model,int year,int maximumspeed)
	{
		super(make,model,year,maximumspeed);
	}
	
	//overriding drive() method
public void drive()
{
	System.out.println(make + "" + model + "Bike is Driving..");
}
}

//Motors class to test functionality
public class Motors 
{

	public static void main(String[] args) 
	{
		//Instantiate Car
		Car car = new Car("Rolls Royce","Ghost",2014,155);
		car.displayAttributes();
		car.drive();
		
		//Instantiate Bike
		Bike bike = new Bike("Yamaha","MT15", 2019, 130);
		bike.displayAttributes();
		bike.drive();
}
}