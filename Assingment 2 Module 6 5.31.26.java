public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money (returns true if successful)
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Get formatted account info
    public String getAccountInfo() {
        return "Account: " + accountNumber +
               ", Owner: " + ownerName +
               ", Balance: $" + balance;
    }
}
