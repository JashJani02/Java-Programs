// Write a Java program with a method that takes two numbers as parameters and returns their sum.

public class Function1 { 
 
 double add(double num1, double num2) {

	return num1+num2;
	}


public static void main (String [] args) { 

	Function1 func = new Function1();

	double result = func.add(78.2,69.69);

	System.out.println("sum is "+result);

}
}