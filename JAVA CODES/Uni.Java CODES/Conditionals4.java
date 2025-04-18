import java.util.Scanner;
public class Conditionals4 {
    public static void main (String[] args)
    {
        float marks;

        System.out.println("enter marks obtained");
        Scanner sc = new Scanner(System.in);

        marks=sc.nextFloat();

        if (marks < 35)
            {
                System.out.println("Failed");
            }
        
            else if (marks>75)
            {
                System.out.println("Distinction");
            }

            else if (marks>60)
            {
                System.out.println("Keep it up");
            }

            else if (marks>50)
            {
                System.out.println("Nice!!!!");
            } 
            else
            {
                System.out.println("Passed");       
            }
        
        sc.close();
    }
}
