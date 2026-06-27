import java.util.Scanner;

public class NumberUtility {

    static void checkPrime(int n) {
        int count = 0;

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        } else {
            System.out.println("Not a Prime Number");
        }
    }

    static void checkPalindrome(int n) {
        int temp = n;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (reverse == n) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

    static void findFactorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }

    static void printFibonacci(int n) {
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n Number Utility Program");
            System.out.println("1. Prime Number");
            System.out.println("2. Palindrome");
            System.out.println("3. Factorial");
            System.out.println("4. Fibonacci");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Number: ");
                    checkPrime(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Number: ");
                    checkPalindrome(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Number: ");
                    findFactorial(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Number of Terms: ");
                    printFibonacci(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Program Closed");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}