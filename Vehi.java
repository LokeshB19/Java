package Polymorphism;

//Base class
class vehicle
{
	//method to start the vehicle
	void start()
	{
		System.out.println("Vehical Started");
	}
}
//Subclass of Base class vehicle
class Car extends vehicle
{
	@Override
	void start()
	{
		System.out.println("Car Started");//implementation of car
	}
}
//Subclass of Base class vehicle
class Motorcycle extends vehicle
{
	@Override
	void start()
	{
		System.out.println("Motorcycle Started");//implementation of motorcycle
	}
}
//class name with garage to service start()
class Garage
{
	//method to service vehicle
	void serviceVehical(vehicle Vehicle)
	{
		//calling start method
		Vehicle.start();
		System.out.println("Vehical Serviced");
	}
}
public class Vehi
{
public static void main(String args[])
{
	//instance of car and motorcycle class
	Car mycar = new Car();
	Motorcycle mymotor = new Motorcycle();
	
	//instance of Garage class
	Garage mygarage = new Garage();
	
	//calling service vehicle() method with instance of both car and motorcycle classes 
	mygarage.serviceVehical(mycar);
	mygarage.serviceVehical(mymotor);
}
}