package AbstractClasses;

import java.util.Scanner;

//Animal class with makeSound() method
class Animal 
{
 public void makeSound() 
 {
     System.out.println("The animal makes a sound.");
 }
}

//Dog class that overrides makeSound() method
class Dog extends Animal 
{
 @Override
 public void makeSound() 
 {
     System.out.println("The dog barks.");
 }
}

//Cat class that overrides makeSound() method
class Cat extends Animal 
{
 @Override
 public void makeSound() 
 {
     System.out.println("The cat meows.");
 }
}

//Main class to demonstrate method overriding
public class AnimalSound 
{
 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Choose an animal (1 for Dog, 2 for Cat): ");
     int choice = scanner.nextInt();

     Animal animal;
     
     // Create object based on user choice and display the sound it makes
     if (choice == 1) 
     {
         animal = new Dog();
     } 
     else if (choice == 2) 
     {
         animal = new Cat();
     } 
     else 
     {
         System.out.println("Invalid choice! Defaulting to a generic Animal.");
         animal = new Animal();
     }

     // Display the sound the selected animal makes
     animal.makeSound();
     
     scanner.close();
 }
}