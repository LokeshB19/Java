package FlowControl;

import java.util.Scanner;

public class OddEvenCounter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int countOdd = 0;
        int countEven = 0;
        int number;

        while (true) 
        {
            System.out.print("Enter a number (-1 to stop): ");
            number = scanner.nextInt();

            if (number == -1) 
            {
                break;
            }

            if (number % 2 == 0) 
            {
                countEven++;
            }
            else 
            {
                countOdd++;
            }
        }

        System.out.println("Total even numbers: " + countEven);
        System.out.println("Total odd numbers: " + countOdd);

        scanner.close();
    }
}
