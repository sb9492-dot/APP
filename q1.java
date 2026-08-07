import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name=sc.nextLine();
        System.out.println("Enter the student roll number: ");
        int roll=sc.nextInt();
        System.out.println("Enter the student department:");
        String department=sc.next();
        System.out.println("Student name: " + name + ", Roll number: " + roll + ", Department: " + department);
    }
}

