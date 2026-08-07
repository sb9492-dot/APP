import java.util.Scanner;
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public void calculateArea(){
        double area=length*width;
        System.out.println("Length of rectangle: " + length);
        System.out.println("Width of rectangle: " + width);
        System.out.println("Area of rectangle: " + area);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double length=sc.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        double width=sc.nextDouble();
        Rectangle r=new Rectangle(length,width);
        r.calculateArea();
        
       
    }

}   
