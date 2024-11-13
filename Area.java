package Inheritance;

//Main class with main method to execute the program
public class Area 
{
 public static void main(String[] args) 
 {
     // Instantiate and call getArea() on each shape
     Circle circle = new Circle(5);
     System.out.println("Circle Area: " + circle.getArea());

     Square square = new Square(4);
     System.out.println("Square Area: " + square.getArea());

     Rectangle rectangle = new Rectangle(3, 6);
     System.out.println("Rectangle Area: " + rectangle.getArea());
 }
}

//Shape class with a method getArea()
abstract class Shape 
{
 // Method to be overridden in subclasses
 public abstract double getArea();
}

//Circle subclass of Shape
class Circle extends Shape 
{
 private int radius;

 // Constructor for Circle class
 public Circle(int radius) 
 {
     this.radius = radius;
 }

 // Overriding getArea() method to calculate the area of a circle
 @Override
 public double getArea() 
 {
     return Math.PI * radius * radius;
 }
}

//Square subclass of Shape
class Square extends Shape 
{
 private int length;

 // Constructor for Square class
 public Square(int length) 
 {
     this.length = length;
 }

 // Overriding getArea() method to calculate the area of a square
 @Override
 public double getArea() 
 {
     return length * length;
 }
}

//Rectangle subclass of Shape
class Rectangle extends Shape 
{
 private int width;
 private int height;

 // Constructor for Rectangle class
 public Rectangle(int width, int height) 
 {
     this.width = width;
     this.height = height;
 }

 // Overriding getArea() method to calculate the area of a rectangle
 @Override
 public double getArea() 
 {
     return width * height;
 }
}