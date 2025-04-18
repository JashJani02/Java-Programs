import java.util.Scanner;
public class Conditionals3
{
    public static void main (String[] args)
    {
        float marks;

        System.out.println("enter marks obtained by the student: ");
        Scanner sc = new Scanner (System.in);

        marks=sc.nextFloat();

        if (marks>=35)
        {
            System.out.println("Congratulations!!! You have passed and have obtained "+marks+" marks");
        }

        else
        {
            System.out.println("Sorry!!! You have failed and have obtained "+marks+" marks");
        }
        sc.close();
        
    }
}
