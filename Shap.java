package AbstractClasses;

//Abstract class Shape
abstract class shape 
{
 // Abstract method calculateArea
 public abstract double calculateArea();
}

//Circle subclass
class Circle extends shape 
{
 private double radius;

 // Constructor
 public Circle(double radius) 
 {
     this.radius = radius;
 }

 // Implementation of calculateArea for Circle
 @Override
 public double calculateArea() 
 {
     return Math.PI * radius * radius;
 }
}

//Rectangle subclass
class Rectangle extends shape 
{
 private double width;
 private double height;

 // Constructor
 public Rectangle(double width, double height) 
 {
     this.width = width;
     this.height = height;
 }

 // Implementation of calculateArea for Rectangle
 @Override
 public double calculateArea() 
 {
     return width * height;
 }
}

//Main class to test the program
public class Shap 
{
 public static void main(String[] args) 
 {
     // Create a Circle with radius 5
     shape circle = new Circle(5);
     System.out.println("The area of the circle is: " + circle.calculateArea());

     // Create a Rectangle with width 4 and height 6
     shape rectangle = new Rectangle(4, 6);
     System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
 }
}