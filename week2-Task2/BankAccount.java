import java.util.ArrayList;

public abstract class BankAccount {

    protected int accountNumber;
    protected String accountHolder;
    protected double balance;
    protected ArrayList<Transaction> transactions;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public abstract void withdraw(double amount);

    public void transfer(BankAccount receiver, double amount) {
        if (receiver == null) {
            System.out.println("Receiver account not found.");
            return;
        }

        double oldBalance = balance;
        withdraw(amount);

        if (balance != oldBalance) {
            receiver.deposit(amount);
            transactions.add(new Transaction("Transfer to " + receiver.getAccountNumber(), amount));
            System.out.println("Amount transferred successfully.");
        }
    }

    public void showStatement() {
        System.out.println(" Account Statement ");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);

        System.out.println("Transaction History:");
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }
}
