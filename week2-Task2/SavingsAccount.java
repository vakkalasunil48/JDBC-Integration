public class SavingsAccount extends BankAccount {

    private static final double MINIMUM_BALANCE = 500.0;

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (balance - amount < MINIMUM_BALANCE) {
            System.out.println("Withdrawal failed. Minimum balance of ₹500 must be maintained.");
            return;
        }

        balance -= amount;
        transactions.add(new Transaction("Withdrawal", amount));
        System.out.println("Amount withdrawn successfully.");
    }
}
