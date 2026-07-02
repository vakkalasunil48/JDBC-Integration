import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println();
            System.out.println(" Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Calculate Average Grade");
            System.out.println("8. Save Data to File");
            System.out.println("9. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.addStudent();
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    manager.searchById();
                    break;

                case 4:
                    manager.searchByName();
                    break;

                case 5:
                    manager.updateStudent();
                    break;

                case 6:
                    manager.deleteStudent();
                    break;

                case 7:
                    manager.calculateAverage();
                    break;

                case 8:
                    manager.saveToFile();
                    break;

                case 9:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 9);

        sc.close();

    }

}
