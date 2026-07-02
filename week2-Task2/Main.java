import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;

        do {

            System.out.println();
            System.out.println("===== Banking System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. View Account Statement");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bank.createAccount();
                    break;

                case 2:
                    bank.depositMoney();
                    break;

                case 3:
                    bank.withdrawMoney();
                    break;

                case 4:
                    bank.transferMoney();
                    break;

                case 5:
                    bank.showStatement();
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}