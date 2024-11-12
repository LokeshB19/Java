class Shape //Base class
{
	// Method to calculate area
	public double getArea()
	{
		return 0.0;  
	}
}
//Subclass Circle
class Circle extends Shape
{
	int radius;
	
	// Constructor to initialize radius
	public Circle(int radius)
	{
		this.radius = radius;
	}
	// Overriding getArea() method
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
}
//Subclass Square
class Square extends Shape
{
	int length;
	// Constructor to initialize length
	public Square(int length)
	{
		this.length = length;
	}
	// Overriding getArea() method
	public double getArea()
	{
		return length * length;
	}
}
//Subclass Rectangle
class Rectangle extends Shape
{
	int width;
	int height;
	// Constructor to initialize width and height
	public Rectangle(int width,int height)
	{
		this.width = width;
		this.height = height;
	}
	// Overriding getArea() method
	public double getArea()
	{
		return width * height;
	}
}
//Main class to test functionality
public class AllShape
{
	public static void main(String args[])
	{
		// Instantiate Circle
		Circle circle = new Circle(5);
		System.out.println("Area of a Circle : " + circle.getArea());
		
		// Instantiate Square
		Square square = new Square(2);
		System.out.println("Area of a Square : " + square.getArea());
		
		// Instantiate Rectangle
		Rectangle rect = new Rectangle(2,7);
		System.out.println("Area of Rectangle : " + rect.getArea());
	}
}