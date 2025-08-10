// Create a program that calculates the area for circle, square, rectangle, and triangle using Switch-Case control structure. 



import java.util.Scanner;
public class PROGRAM4 {

	public static void main (String [] args) 

	{

	Scanner sc = new Scanner(System.in);
		int choice;

	System.out.println("enter 1 for square\t enter 2 for rectangle\t enter 3 for triangle");
	choice = sc.nextInt();

	switch(choice) {

	case 1: {

	System.out.println("enter the length: ");
	double length = sc.nextDouble();

	double result = length*length;

	System.out.println("Area of square is: "+result);
break;
	}


	case 2: {
	
	System.out.println("enter sides: ");
	double length = sc.nextDouble();
	double breadth = sc.nextDouble();
	
	double result = length*breadth;

	System.out.println("Area of rectangle is: "+result);
break;
	}

	case 3: {

		System.out.println("enter sides: ");
	double base = sc.nextDouble();
	double height = sc.nextDouble();

	double result = 0.5*base*height;

	System.out.println("Area of triangle is: "+result);	
	break;

	}

	}
	
	sc.close();
}
	
	
	}

