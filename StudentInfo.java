import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name;
        int regNo;
        int mark1,mark2,mark3;
        double average;

        System .out.println("Enter Student Name: ");
        name = sc.nextLine();
        System.out.println("Enter Register number: ");
        regNo = sc.nextInt();
        System.out.println("Enter mark 1: ");
        mark1=sc.nextInt();
        System.out.println("Enter mark 2: ");
        mark2=sc.nextInt();
        System.out.println("Enter mark 3: ");
        mark3=sc.nextInt();

        average =(mark1+mark2+mark3)/3.0;
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + regNo);
        System.out.println("Average Mark: " + average);
        sc.close();
    }
    
}
