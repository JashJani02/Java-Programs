//Create a program that determines whether a given year is a leap year using if-else conditions.


import java.util.Scanner;
public class Conditional3 {

public static void main (String [] args)

{
		Scanner sc = new Scanner(System.in);
	double year;

	System.out.println("Enter the year to check: ");
	year = sc.nextDouble();

	if (year % 4 == 0) {
	
	System.out.println(" "+year+" is a leap year ");

	}

	else {
		System.out.println(" "+year+" is not a leap year ");

	}
	sc.close();
}
}