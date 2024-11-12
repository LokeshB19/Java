package bankapp; //created a package to execute both file and get the output
//Create an Enum with a name called BankName
public enum BankName 
{
    ICICI(6.3),
    HDFC(5.8),
    SBI(6.0);

    private final double interestRate;

    // Enum constructor
    BankName(double interestRate) 
    {
        this.interestRate = interestRate;
    }

    // Getter for interest rate
    public double getInterestRate() 
    {
        return interestRate;
    }
}

