//Implement a program that reads three numbers from the user and calculates their average.

public class Function3 {

double avg(double num1,double num2,double num3) {

	return (num1+num2+num3)/3;

}

public static void main (String [] args) {

 	Function3 func = new Function3();

	System.out.println("Average of numbers: 12,13,14 is "+func.avg(12,13,14));
}
}