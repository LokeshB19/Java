package Polymorphism;
//Student class
class student 
{
//Instance variables
String name;
int age;
String department;

//Default constructor
public student() 
{
 this.name = "Unknown";
 this.age = 20;
 this.department = "Unassigned";
}

//Constructor with name and age, department defaults to "IT"
public student(String name, int age) 
{
 this.name = name;
 this.age = age;
 this.department = "IT";
}

//Constructor with name, age, and department
public student(String name, int age, String department) 
{
 this.name = name;
 this.age = age;
 this.department = department;
}

//Method to display student details
public void displayDetails() 
{
 System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
}
}

//Main class to test the implementation
public class Stud 
{
public static void main(String[] args) 
{
 // Create instances of Student using each constructor
 student student1 = new student(); // Default constructor
 student student2 = new student("Loke", 22); // Constructor with name and age
 student student3 = new student("jack", 25, "Engineering"); // Constructor with name, age, and department

 // Display details of each student
 student1.displayDetails();
 student2.displayDetails();
 student3.displayDetails();
}
}
