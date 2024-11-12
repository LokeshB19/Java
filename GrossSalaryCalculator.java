package FlowControl;

import java.util.Scanner;

public class GrossSalaryCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do 
        {
            System.out.print("\nEnter the basic salary of the employee: ");
            double basicSalary = scanner.nextDouble();

            double hra, da, grossSalary;

            if (basicSalary > 15000) 
            {
                hra = basicSalary * 0.20; // HRA = 20% of basic salary
                da = basicSalary * 0.60;  // DA = 60% of basic salary
            } 
            else 
            {
                hra = 3000;               // HRA = 3000
                da = basicSalary * 0.70;  // DA = 70% of basic salary
            }

            grossSalary = basicSalary + hra + da;
            System.out.printf("Gross Salary of the employee: %.2f\n", grossSalary);

            System.out.print("Enter -1 to calculate the salary of another employee or any other number to exit: ");
            choice = scanner.nextInt();

        } 
        while (choice == -1);

        System.out.println("Program exited.");
        scanner.close();
    }
}
