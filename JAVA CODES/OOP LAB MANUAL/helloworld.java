import java.util.Scanner;
public class helloworld
{
    public static void main (String []args)
    {
        System.out.println("Hello World\nLet's gooo\nYeah\tBOI!!!");

        System.out.println("Enter your name:");
        Scanner sc1 = new Scanner (System.in);

        String name = sc1.nextLine();

        System.out.println("Enter an integer: ");
        //Scanner sc1= new Scanner (System.in);

        int num = sc1.nextInt();

        System.out.println("Enter a float: ");
        //Scanner sc1 = new Scanner (System.in);

        float fp = sc1.nextFloat();
        
        System.out.println("Enter a double: ");
        //Scanner sc1 = new Scanner (System.in);

        double dp = sc1.nextDouble();

        System.out.println("Enter a long: ");
        //Scanner sc5 = new Scanner (System.in);

        long lp = sc1.nextLong();


        System.out.println("Name: "+name+"\nInteger: "+num+"\nFloat: "+fp+"\nDouble: "+dp+"\nLong: "+lp);

        sc1.close();
       
    }
}