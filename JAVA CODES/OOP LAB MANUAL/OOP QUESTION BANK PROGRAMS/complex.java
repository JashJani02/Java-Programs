import java.util.Scanner;
public class complex 
{

public static void main (String[] args)
{

    Scanner sc = new Scanner(System.in);

        System.out.println("enter a num:");

        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();

        double avg = (num1+num2+num3)/3;

    System.out.println(avg);

sc.close();
}
}  