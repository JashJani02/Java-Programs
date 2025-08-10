// Implement a program that asks the user for a number and prints its square.

import java.util.Scanner;
public class Function4 {

	public static void main (String [] args) {

			
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double num = sc.nextDouble();


		System.out.println("the number's square is: "+num*num);

sc.close();
}

}