import java.util.Scanner;
public class Conditionals2
{
    public static void main (String[] args)
    {
        int a,b;

        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);

        a=sc.nextInt();

        System.out.println("enter second number");
        b=sc.nextInt();

        if (a==b)
        {
            System.out.println("both "+a+" and "+b+" are equal ");
        }

        if (a>b)
        {
            System.out.println("number "+a+" is highest from the given range of "+a+" and " +b);
        }

        if (a<b)
        {
            System.out.println("number "+a+" is lowest from the given range of "+a+" and "+b);
        }
        sc.close();
    }
}
