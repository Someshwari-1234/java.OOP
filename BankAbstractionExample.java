// Abstract class representing a Bank Account
abstract class BankAccount {
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Abstract methods (no implementation)
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    // Concrete method (common functionality)
    public void displayBalance() {
        System.out.println(accountHolderName + "'s Current Balance: ₹" + balance);
    }
}

// Concrete subclass 1
class SavingsAccount extends BankAccount {
    private double interestRate = 0.05; // 5% interest

    public SavingsAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Savings Account.");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}

// Concrete subclass 2
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 10000; // ₹10,000 overdraft limit

    public CurrentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Current Account.");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// Main class to test abstraction
public class BankAbstractionExample {
    public static void main(String[] args) {
        // Upcasting to abstract class reference
        BankAccount acc1 = new SavingsAccount("Someshwari", 10000);
        BankAccount acc2 = new CurrentAccount("Ravi", 20000);

        System.out.println("----- Savings Account Operations -----");
        acc1.deposit(5000);
        acc1.withdraw(3000);
        acc1.displayBalance();

        // Downcasting to access subclass-specific method
        ((SavingsAccount) acc1).addInterest();
        acc1.displayBalance();

        System.out.println("\n----- Current Account Operations -----");
        acc2.deposit(8000);
        acc2.withdraw(25000);
        acc2.displayBalance();
    }
}
