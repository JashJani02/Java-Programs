import java.util.Scanner;
public class switchCase1 
{
 
    public static void main (String[] args)
    {
        float num1,num2;

        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);

        num1=sc.nextFloat();

        System.out.println("enter second number");
        Scanner sc2 = new Scanner(System.in);

        num2=sc2.nextFloat();

        System.out.println("enter the operation you would like to execute");

        int operation = sc.nextInt();

        switch(operation)
        {
            case 1:
            {
                System.out.println("Sum of "+num1+" and "+num2+" is "+(num1+num2));
                break;
            }

            case 2:
            {
                System.out.println("Difference of "+num1+" and "+num2+ " is "+(num1-num2));
                break;
            }

            case 3:
            {
            System.out.println("Product of "+num1+" and "+num2+" is "+(num1*num2));
            break;
            }

            case 4:
            {
                System.out.println("Quotient of "+num1+" and "+num2+" is "+(num1/num2));
                break;
            }

            case 5:
            {
                System.out.println("Square of "+num1+" and "+num2+" is "+ (num1*num1)+" and "+(num2*num2));
                break;
            }
        }

        sc.close();
        sc2.close();
    }
}
