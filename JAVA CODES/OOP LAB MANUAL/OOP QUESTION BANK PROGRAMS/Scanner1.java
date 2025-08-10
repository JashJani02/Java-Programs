// Write a Java program that takes user input for a name and age and prints a greeting message using Scanner.

import java.util.Scanner;
public class Scanner1 {

public static void main (String [] args) {

	Scanner sc = new Scanner(System.in);

	String name;
	int age;

	System.out.println("Enter your name: ");
	name = sc.nextLine();
	System.out.println("Enter your age: ");
	age = sc.nextInt();

	System.out.println("Hi "+name+" your age is "+age);

	sc.close();

}
}