class Animal 
{
    // Method to make sound
    public void makeSound() 
    {
        System.out.println("The animal makes a sound.");
    }
}

// Dog.java
class Dog extends Animal 
{
    // Overridden method for Dog's sound
    @Override
    public void makeSound() 
    {
        System.out.println("The dog barks.");
    }
}

// Cat.java
class Cat extends Animal 
{
    // Overridden method for Cat's sound
    @Override
    public void makeSound() 
    {
        System.out.println("The cat meows.");
    }
}

// Main.java
public class DogCat 
{
    public static void main(String[] args) 
    {
        // Create objects of Animal, Dog, and Cat classes
        Animal PetAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Display sound for each animal
        System.out.println("Animal Sound:");
        PetAnimal.makeSound();

        System.out.println("\nDog Sound:");
        dog.makeSound();

        System.out.println("\nCat Sound:");
        cat.makeSound();
    }
}
