public class Student {

    private int id;
    private String name;
    private int age;
    private int grade;
    private String subject;

    public Student(int id, String name, int age, int grade, String subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayStudent() {
        System.out.println("");
        System.out.println("Student ID      : " + id);
        System.out.println("Student Name    : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Grade           : " + grade);
        System.out.println("Subject         : " + subject);
        System.out.println("");
    }

}
