// Implement a program that overloads a method to print different types of data (int, double, and String).

public class MethodOverloading2 {

	void Display(int number)

	{
		System.out.println("ur number is: "+number);
	}

	
	void Display(double number) 

	{
		System.out.println(" ur double is: "+number);
	}

	void Display(String name) 

	{
		System.out.println(" ur name is: "+name);
	}
		


public static void main (String [] args) {

	MethodOverloading2 func = new MethodOverloading2();

	func.Display(69);
	func.Display(69.79);
	func.Display("Jash");

}
}

	