import java.util.Scanner;
public class Student5 {
    private String name;
    private int age;

    public Student5(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
    
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student 1: ");
        String name1=sc.nextLine();
        System.out.println("Enter the age of the student 1: ");
        int age1=sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the name of the student 2: ");
        String name2=sc.nextLine();
        System.out.println("Enter the age of the student 2: ");
        int age2=sc.nextInt();
        sc.nextLine(); 
        Student5 student1=new Student5(name1,age1);
        Student5 student2=new Student5(name2,age2);
        student1.display();
        student2.display();
    }
}