import java.util.Scanner;
public class Method5 
{    static Scanner sc = new Scanner(System.in);
    void daLibrary()
    {
    System.out.println("Welcome to da ultimate Library!!!!!!!");
      
    }

    double add ()
    {
        double a,b,c;
        System.out.println("Enter first number:- ");
        a = sc.nextDouble();
        System.out.println("Enter second number:- ");
        b = sc.nextDouble();
        c = a+b;
        return c;
    }

    double multiply(double num1, double num2)
    {
        return num1*num2;
    }
    void bookDetails(String bookName, String author, float price)
    {
        System.out.println("\nTitle:- "+bookName+"\n"+"Author:- "+author+"\n"+"Price:- $"+price);
    } 


    public static void main(String[] args) {
        
        Method5 lib = new Method5(); 
        Method5 bd = new Method5();

        lib.daLibrary();

        System.out.println("Enter book name:- ");
        String bookName = sc.nextLine();
        System.out.println("Enter author name:- ");
        String author = sc.nextLine();
        System.out.println("Enter price:- ");
        float price = sc.nextFloat();

        bd.bookDetails(bookName, author, price);
    }
}
