// Question 15: Write a Java program to create a class named Account, which contains account number, balance, and methods to deposit and withdraw money.
// Derive two classes: SavingsAccount and CurrentAccount. SavingsAccount should have a method to add interest, and CurrentAccount should have a method to deduct fees.
// Demonstrate the working of these classes.

class Account {
    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient amount.");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

class CurrentAccount extends Account {
    double fee;

    public CurrentAccount(int accountNumber, double balance, double fee) {
        super(accountNumber, balance);
        this.fee = fee;
    }

    void deductFees() {
        if (balance >= fee) {
            balance -= fee;
            System.out.println("Fee Deducted: " + fee);
        } else {
            System.out.println("Insufficient balance to deduct fee.");
        }
    }
}

class AccountTest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(12345, 1000, 5);
        CurrentAccount current = new CurrentAccount(67890, 2000, 50);

        System.out.println("Savings Account Actions:");
        savings.displayBalance();
        savings.deposit(500);
        savings.addInterest();
        savings.withdraw(200);
        savings.displayBalance();

        System.out.println("\nCurrent Account Actions:");
        current.displayBalance();
        current.deposit(1000);
        current.deductFees();
        current.withdraw(500);
        current.displayBalance();
    }
}
