// Create a program that checks whether a given character is a vowel or a consonant using if-else.

import java.util.Scanner;
public class Conditional5 {


	public static void main (String [] args) 
		{ 

		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter a character: ");

	char ch = sc.next().charAt(0);
	ch = Character.toLowerCase(ch);

	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u') { System.out.println("character is a vowel"); }
	else { System.out.println("character is a consonant"); }

	sc.close();
		}

}