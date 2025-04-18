    /*
    To take input from user in java we use Scanner class.
    Scanner can be used to read input of all primitive types.
    it can be imported from java.util package.

    Syntax:- java.util.Scanner;

    to import all the pacakges of java.util package we can use

    Syntax:- import java.util.*;

    to create an object of Scanner class we use
    Scanner sc = new Scanner(System.in);

    to read input from user we use
    sc.nextInt();

    sc. is the object of Scanner class and nextInt() is the method of Scanner class.

    next.Int or nextDouble or nextFloat or nextLong or nextShort or nextByte or nextBoolean or nextLine

    we can use by the following syntaxes

    Scanner sc = new scanner(System.in);

    int a = sc.nextInt();
    double b = sc.nextDouble();
    float c = sc.nextFloat();
    long d = sc.nextLong(); 
    short e = sc.nextShort();
    byte f = sc.nextByte();
    boolean g = sc.nextBoolean();
    String h = sc.nextLine();


    are used to store the input of respective data types. 

 */



import java.util.Scanner;
public class scannerIntro1 {


    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name  = sc.nextLine();

        System.out.println("Enter an int: ");
        int number = sc.nextInt();

        System.out.println("Enter a float:");
        float fpnum = sc.nextFloat();

        System.out.println("Enter a double: ");
         
        double dpnum = sc.nextDouble();

        System.out.println("Enter a long:");
        long lpnum = sc.nextLong();

        System.out.println("Enter a char: ");
        char ch = sc.next().charAt(0);

        System.out.println("name as input is \n"+name+"\nnumber as input is \n"+number+"\nfloating point number as input is \n"+fpnum+"\ndouble point number as input is \n"+dpnum+"\nlong point number as input is \n"+lpnum+"\ncharacter as input is \n"+ch);

        boolean decision;

        if (number%2==0)
        {
            decision = true;

            System.out.println("The number is even: "+decision);
        }

        else
        {
            decision = false;
            System.out.println("The number is odd: "+decision);
        }

        sc.close();
    }
}