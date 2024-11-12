import java.util.Scanner;
public class Car 
{
	 private String make; //attributes of Car
	    private String model; //attributes of Car
	    private short year; //attributes of Car
	    private int price; //attributes of Car
	    
	    //constructor to initialize car attributes
	    public Car(String make, String model, short year, int price) 
	    {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.price = price;
	    }
	    
	 // Method to display car details
	    public void displayCarDetails() 
	    {
	        System.out.println("Car Make: " + make);
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Year: " + year);
	        System.out.println("Car Price: " + price +"Cr.INR");
	    }
	    
	    // Main method to instantiate and display Car objects
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//user Enters Car details
		  System.out.print("Enter Car Make: ");
	        String make = scanner.nextLine();
	        
	        System.out.print("Enter Car Model: ");
	        String model = scanner.nextLine();
	        
	        System.out.print("Enter Car Year: ");
	        short year = scanner.nextShort();
	        
	        System.out.print("Enter Car Price: ");
	        int price = scanner.nextInt();

	        // Create a new Car object
	        Car userCar = new Car(make, model, year, price);

	        // Display the Car details
	        System.out.println("\nCar Details:");
	        userCar.displayCarDetails();
	}

}
