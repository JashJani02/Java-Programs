// Implement a switch-case program that takes a character input (+, -, *, /) and performs the corresponding arithmetic operation on two numbers.


 import java.util.Scanner; 
public class Conditional4 { 

	double add (double a, double b) {
	return a+b; }

	double difference (double a, double b) {
	return a-b; }

	double product (double a, double b) {
	return a*b; }

	double quotient (double a, double b) {
	return a/b; }

public static void main (String [] args) {

	Scanner sc = new Scanner (System.in);

	Conditional4 func = new Conditional4();

	int choice;

	System.out.println("Enter from the numeric range b/t 1-4, to perform the corresponding operations (+,-,*,/)");
	choice = sc.nextInt();

	switch (choice)  {

	case 1: { double result = func.add(5,7); System.out.println("sum is: "+result); break; }
	case 2: { double result = func.difference(5,7); System.out.println("Difference is: "+result); break; }
	case 3: { double result = func.product(5,7); System.out.println("Product  is: "+result); break; }
	case 4: { double result = func.quotient(5,7); System.out.println("Quotient is: "+result); break; }
	default: { System.out.println("Invalid"); }

	}
	sc.close();
}
}
	