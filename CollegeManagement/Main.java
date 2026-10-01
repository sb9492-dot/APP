package CollegeManagement;

import CollegeManagement.Course.Course;
import CollegeManagement.Student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, "Computer Science");
        Course course = new Course("Java Programming", "CS101");

        student.displayStudent();
        course.displayCourse();
    }
}