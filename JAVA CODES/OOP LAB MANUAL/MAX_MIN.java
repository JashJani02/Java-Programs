import java.util.Scanner;
public class MAX_MIN {

public static void main (String[]args)
{
    Scanner scanner = new Scanner(System.in);

 
    double num1,num2;

    System.out.println("Enter the numbers for Comparision: ");

    num1 = scanner.nextDouble();
    num2 = scanner.nextDouble();

       double result1 =  Math.max(num1, num2);
       double result2 =  Math.min(num1, num2);

       if (num1==num2)
       {
        System.out.println("both "+num1+" and "+num2+" are equal");
       }
       else {
    System.out.println("The Maximum of the two numbers is: "+result1+"\nThe Minimum of the two numbers is: "+result2);
       }
    scanner.close();
}

}