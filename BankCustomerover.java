package Javaprogram;

public class BankCustomerover {
	
    private int acno;
    private String atype;
    private double amt;

    // Default Constructor
    public BankCustomerover() {
        acno = 0;
        atype = "Savings";
        amt = 0.0;
        System.out.println("Default Constructor Called.");
    }

    // Constructor with one parameter (account number)
    public BankCustomerover(int acno) {
        this.acno = acno;
        this.atype = "Savings";
        this.amt = 0.0;
        System.out.println("Constructor with Account Number Called.");
    }

    // Constructor with two parameters (account number, account type)
    public BankCustomerover(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0;
        System.out.println("Constructor with Account Number and Account Type Called.");
    }

    // Constructor with three parameters (account number, account type, amount)
    public BankCustomerover(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
        System.out.println("Constructor with Account Number, Account Type, and Amount Called.");
    }

    // Display method to show customer details
    public void displayDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    public static void main(String[] args) {
        // Testing different constructors
        BankCustomerover customer1 = new BankCustomerover();
        customer1.displayDetails();
        
        BankCustomerover customer2 = new BankCustomerover(12345);
        customer2.displayDetails();

        BankCustomerover customer3 = new BankCustomerover(12346, "Current");
        customer3.displayDetails();

        BankCustomerover customer4 = new BankCustomerover(12347, "Fixed Deposit", 1000.0);
        customer4.displayDetails();
    }
}
/* Output:
Default Constructor Called.
Account Number: 0
Account Type: Savings
Amount: 0.0
Constructor with Account Number Called.
Account Number: 12345
Account Type: Savings
Amount: 0.0
Constructor with Account Number and Account Type Called.
Account Number: 12346
Account Type: Current
Amount: 0.0
Constructor with Account Number, Account Type, and Amount Called.
Account Number: 12347
Account Type: Fixed Deposit
Amount: 1000.0
*/