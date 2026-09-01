
import java.util.Scanner;
import Student.Student;
import Course.Course;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        System.out.print("Enter course code: ");
        int code = sc.nextInt();

        Student s = new Student(name, roll);
        Course c = new Course(course, code);

        System.out.println("\nStudent Details");
        s.display();

        System.out.println("\nCourse Details");
        c.display();
    }
}


