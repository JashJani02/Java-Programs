// Write a Java program that defines a method to find the maximum of three numbers and calls that method from the main function.

public class Function2 {

	double max(double num1,double num2,double num3)

	{
		if (num1>num2 && num1>num3) { return num1; } 
		else if (num2>num1 && num2>num3) { return num2; }
		else { return num3; }
		
	}

	double min(double num1,double num2,double num3)

	{	
		if (num1<num2 && num1<num3) { return num1; } 
		else if (num2<num1 && num2<num3) { return num2; }
		else { return num3; }

				
	}
	



public static void main (String [] args)

{
		Function2 func = new Function2();

	double resMax = func.max(1,2,3);
	double resMin = func.min(1,2,3);
			

		System.out.println("Maximum is: "+resMax+"\n Minimum is :"+resMin);
}
}
