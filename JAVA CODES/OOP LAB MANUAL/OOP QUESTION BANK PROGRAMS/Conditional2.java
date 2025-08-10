// Implement a switch-case program that prints the name of a day based on a given number (1 for Monday, 2 for Tuesday, etc.).

import java.util.Scanner;
public class Conditional2 {

public static void main (String [] args) {

Scanner sc = new Scanner(System.in);

int choice;

 System.out.println("Enter the number b/w the range of 1-7 to display its corresponding day");
	
	choice = sc.nextInt();

switch(choice)

	{
		case 1:
		{
			System.out.println("Its Sunday");
break;
		}

		case 2:
		{
			System.out.println("Its Monday");
break;
		}

		case 3:
		{
			System.out.println("Its Tuesday");
break;
		}

		case 4:
		{
			System.out.println("Its Wednesday");
break;
		}

		case 5:
		{
			System.out.println("Its Thuresday");
break;
		}

		case 6:
		{
			System.out.println("Its Friday");
break;
		}

		case 7:
		{
			System.out.println("Its Saturday");
			break;
		}

		default: {
		System.out.println("Invalid");
		}

		}

	sc.close();
	}
	}





