import java.util.HashMap;
import java.util.Scanner;

public class Bank {

    private HashMap<Integer, BankAccount> accounts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose Account Type: ");
        int type = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists.");
            return;
        }

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (type == 1) {
            accounts.put(accNo, new SavingsAccount(accNo, name, balance));
        } else if (type == 2) {
            accounts.put(accNo, new CurrentAccount(accNo, name, balance));
        } else {
            System.out.println("Invalid Account Type.");
            return;
        }

        System.out.println("Account Created Successfully.");
    }

    public void depositMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount account = accounts.get(accNo);

        if (account == null) {
            System.out.println("Account Not Found.");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
    }

    public void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount account = accounts.get(accNo);

        if (account == null) {
            System.out.println("Account Not Found.");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        account.withdraw(amount);
    }

    public void transferMoney() {

        System.out.print("Enter Sender Account Number: ");
        int sender = sc.nextInt();

        System.out.print("Enter Receiver Account Number: ");
        int receiver = sc.nextInt();

        BankAccount senderAccount = accounts.get(sender);
        BankAccount receiverAccount = accounts.get(receiver);

        if (senderAccount == null || receiverAccount == null) {
            System.out.println("Invalid Account Number.");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        senderAccount.transfer(receiverAccount, amount);
    }

    public void showStatement() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount account = accounts.get(accNo);

        if (account == null) {
            System.out.println("Account Not Found.");
            return;
        }

        account.showStatement();
    }

}
