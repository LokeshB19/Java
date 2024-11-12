import java.util.Scanner;

public class Calculator
    {

    // First add() method: takes two integers and returns their sum
    public int add(int a, int b) 
    {
        return a + b;
    }

    // Second add() method: takes three integers and returns their sum
    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    // Third add() method: takes two doubles and returns their sum
    public double add(double a, double b) 
    {
        return a + b;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Example 1: Calling the first add() method (two int arguments)
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("\nSum of two integers: " + calculator.add(num1, num2));

        // Example 2: Calling the second add() method (three int arguments)
        System.out.print("\nEnter third integer: ");
        int num3 = scanner.nextInt();
        System.out.println("Sum of three integers: " + calculator.add(num1, num2, num3));

        // Example 3: Calling the third add() method (two double arguments)
        System.out.print("\nEnter first double: ");
        double doubleNum1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double doubleNum2 = scanner.nextDouble();
        System.out.println("\nSum of two doubles: " + calculator.add(doubleNum1, doubleNum2));
    }
}
