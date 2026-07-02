import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        System.out.print("Enter Grade : ");
        int grade = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Subject : ");
        String subject = sc.nextLine();

        Student s = new Student(id, name, age, grade, subject);

        students.add(s);

        System.out.println("Student Added Successfully");
    }

    public void displayStudents() {

        if (students.size() == 0) {
            System.out.println("No Student Records Found");
            return;
        }

        for (Student s : students) {
            s.displayStudent();
        }
    }

    public void searchById() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        boolean found = false;

        for (Student s : students) {

            if (s.getId() == id) {

                s.displayStudent();
                found = true;
                break;

            }

        }

        if (!found) {
            System.out.println("Student Not Found");
        }

    }

    public void searchByName() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        boolean found = false;

        for (Student s : students) {

            if (s.getName().equalsIgnoreCase(name)) {

                s.displayStudent();
                found = true;
                break;

            }

        }

        if (!found) {
            System.out.println("Student Not Found");
        }

    }

    public void updateStudent() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        boolean found = false;

        for (Student s : students) {

            if (s.getId() == id) {

                sc.nextLine();

                System.out.print("Enter New Name : ");
                s.setName(sc.nextLine());

                System.out.print("Enter New Age : ");
                s.setAge(sc.nextInt());

                System.out.print("Enter New Grade : ");
                s.setGrade(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter New Subject : ");
                s.setSubject(sc.nextLine());

                System.out.println("Student Updated Successfully");

                found = true;

                break;

            }

        }

        if (!found) {
            System.out.println("Student Not Found");
        }

    }

    public void deleteStudent() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.remove(i);

                System.out.println("Student Deleted Successfully");

                found = true;

                break;

            }

        }

        if (!found) {
            System.out.println("Student Not Found");
        }

    }

    public void calculateAverage() {

        if (students.size() == 0) {

            System.out.println("No Student Records Found");

            return;

        }

        int total = 0;

        for (Student s : students) {

            total = total + s.getGrade();

        }

        double average = (double) total / students.size();

        System.out.println("Average Grade : " + average);

    }

    public void saveToFile() {

        try {

            FileWriter fw = new FileWriter("students.txt");

            for (Student s : students) {

                fw.write(s.getId() + " ");
                fw.write(s.getName() + " ");
                fw.write(s.getAge() + " ");
                fw.write(s.getGrade() + " ");
                fw.write(s.getSubject());
                fw.write("\n");

            }

            fw.close();

            System.out.println("Data Saved Successfully");

        } catch (IOException e) {

            System.out.println("Error Saving File");

        }

    }

}
