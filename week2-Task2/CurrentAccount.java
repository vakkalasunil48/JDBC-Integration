public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance = balance - amount;
        transactions.add(new Transaction("Withdrawal", amount));

        System.out.println("Amount withdrawn successfully.");
    }
}
