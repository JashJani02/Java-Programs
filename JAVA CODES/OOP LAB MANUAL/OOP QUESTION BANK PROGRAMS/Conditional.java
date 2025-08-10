//Write a Java program that checks if a number is positive, negative, or zero using if-else-if statements.


import java.util.Scanner;
public class Conditional
{

	public static void main (String [] args)
{

	Scanner sc = new Scanner(System.in);

	double number;


	System.out.println("Enter the value of a number to be checked for");

	number = sc.nextDouble();

	if (number == 0) {

	System.out.println("your given number is "+number);
	
	}

		else if (number>0) {

		System.out.println("your given number is "+number+" a positive number");

		}

	else {

		System.out.println("your given number is "+number+" a negative number");

		}

	sc.close();

}
}