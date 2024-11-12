package bankapp;
//create a new class called BankAccount to inherit the Enum values
public class BankAccount 
{
    private String accountHolderName;
    private BankName bankName;
    private double accountBalance;

    // Constructor
    public BankAccount(String accountHolderName, BankName bankName, double initialBalance) 
    {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    // Method to get balance
    public double getBalance() 
    {
        return accountBalance;
    }

    // Method to deposit money
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            accountBalance += amount;
            System.out.println("Deposited " + amount + " into account of " + accountHolderName);
        } else 
        {
            System.out.println("Deposit amount should be positive");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= accountBalance) 
        {
            accountBalance -= amount;
            System.out.println("Withdrew " + amount + " from account of " + accountHolderName);
        } else 
        {
            System.out.println("Invalid withdrawal amount for account of " + accountHolderName);
        }
    }

    // Method to calculate total interest
    public double calculateInterest(int numberOfYears) 
    {
        double totalInterest = bankName.getInterestRate() * numberOfYears * accountBalance / 100;
        System.out.println("Total interest for " + numberOfYears + " years in " + bankName + ": " + totalInterest);
        return totalInterest;
    }

    // Main method to test BankAccount class
    public static void main(String[] args) 
    {
        // Create three bank accounts with different banks using the enum
        BankAccount account1 = new BankAccount("Ramu", BankName.ICICI, 1000.0);
        BankAccount account2 = new BankAccount("Nandan", BankName.HDFC, 2000.0);
        BankAccount account3 = new BankAccount("Uday", BankName.SBI, 3000.0);

        // Display bank name and calculate interest for each account
        System.out.println("Account Holder: " + account1.accountHolderName + ", Bank: " + account1.bankName);
        account1.calculateInterest(2);

        System.out.println("\nAccount Holder: " + account2.accountHolderName + ", Bank: " + account2.bankName);
        account2.calculateInterest(3);

        System.out.println("\nAccount Holder: " + account3.accountHolderName + ", Bank: " + account3.bankName);
        account3.calculateInterest(4);
    }
}
