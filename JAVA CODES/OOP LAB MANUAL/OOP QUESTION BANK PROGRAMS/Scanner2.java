// Implement a program that reads three numbers from the user and calculates their average.

import java.util.Scanner;

public class Scanner2 {

public static void main(String [] args) { 

	Scanner sc = new Scanner(System.in);

	double num1,num2,num3;

	System.out.println("Enter numbers: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();

		double result = (num1+num2+num3)/3;
		System.out.println(result);

	sc.close();
}
}