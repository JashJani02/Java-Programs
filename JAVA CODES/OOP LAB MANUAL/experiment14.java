import java.util.Scanner;
public class experiment14
{

public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("enter 1 to print natural numbers \n enter 2 to print even numbers \n enter 3 to print odd numbers");

    int choice, limit, i;

    System.out.println("enter choice ");
    choice = sc.nextInt();

    switch (choice)
    {
        case 1: //  1 to 10
        {
        System.out.println("enter the limit");
        limit = sc.nextInt();
        for (i = 1; i <= limit; i++)
        {
            System.out.println(i);
        } 
        break;
        }

        case 2: // even
        {
        System.out.println("enter the limit");
        limit = sc.nextInt();
        for (i = 1; i <= limit; i++)
        {
            if (i%2 == 0)
            {
               System.out.println(i);
            }
            
        }
        break;
        }

        case 3: // odd
        {
        System.out.println("enter limit");
        limit = sc.nextInt();

        for(i=1; i<=limit; i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
        break;
        }

         case 4: // 1,10,2,9,3,8 
        {
        System.out.println("enter the limit");
        limit = sc.nextInt();
        
        int start=1;
        int end=10;

        for(i=0; i<=limit; i++)
        {
            System.out.println(start++ +"");
            System.out.println(end-- +"");         
        }
        break;
        }
        
        case 5: // 120,140,121,139,122,138
        {
        System.out.println("enter the limit");
        limit = sc.nextInt();

        int start=120;
        int end=140;

        for(i=0; i<=limit; i++)
        {
            System.out.println(start++ +"");
            System.out.println(end-- +"");
        }
        break;
        }
}

    sc.close();
}
}