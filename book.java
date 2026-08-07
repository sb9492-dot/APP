import java.util.Scanner;
public class book {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book name: ");
        String name=sc.nextLine();
        System.out.println("Enter the book author: ");
        String author=sc.nextLine();
        System.out.println("Enter the book price:");
        double price=sc.nextDouble();
        System.out.println("Book name: " + name );
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price);

    
}
}
