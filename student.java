import java.util.Scanner;
public class student {
    private String name;
    private int rollNumber;

    public student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void display(){
        System.out.println("Student name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name=sc.nextLine();
        System.out.println("Enter student roll number: ");
        int rollNumber=sc.nextInt();
        student s=new student(name, rollNumber);
        s.display();    
    }

    
}
