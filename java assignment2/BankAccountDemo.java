// Question 18: Write a Java program to create a class called BankAccount, which is shared among multiple threads.
// Each thread should either deposit or withdraw a certain amount from the bank account.
// Demonstrate synchronization to ensure the balance remains accurate.

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", New Balance: " + balance);
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount + " but insufficient balance.");
        }
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread depositThread1 = new DepositThread(account, 500);
        Thread withdrawThread1 = new WithdrawThread(account, 200);
        Thread withdrawThread2 = new WithdrawThread(account, 800);
        Thread depositThread2 = new DepositThread(account, 300);

        depositThread1.setName("DepositThread1");
        withdrawThread1.setName("WithdrawThread1");
        withdrawThread2.setName("WithdrawThread2");
        depositThread2.setName("DepositThread2");

        depositThread1.start();
        withdrawThread1.start();
        withdrawThread2.start();
        depositThread2.start();
    }
}
