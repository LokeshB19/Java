package FlowControl;

import java.util.Scanner;

public class Armstrong 
{

    // Method to print Armstrong numbers within a given range
    public static void printArmstrongNumber(int start, int end) 
    {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        // Loop through the range
        for (int i = start; i <= end; i++) 
        {
            if (isArmstrong(i)) 
            {
                System.out.println(i);
            }
        }
    }

    // Helper method to check if a number is an Armstrong number
    private static boolean isArmstrong(int number) 
    {
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of the cubes of its digits
        while (number != 0) 
        {
            int digit = number % 10;
            sum += cube(digit);  // Adding the cube of the digit
            number /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    // Helper method to calculate the cube of a number without Math.pow()
    private static int cube(int n) 
    {
        return n * n * n;
    }

    // Main method to take user input and call the printArmstrongNumber method
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input range from the user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Call the method to print Armstrong numbers in the given range
        printArmstrongNumber(start, end);
        
        scanner.close();
    }
}