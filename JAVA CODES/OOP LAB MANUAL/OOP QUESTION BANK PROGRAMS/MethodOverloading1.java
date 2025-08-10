// Write a Java class demonstrating method overloading with methods for calculating the area of a circle and a rectangle.

public class MethodOverloading1 {

	double area(double radius) { 
		
		return 3.14*radius*radius;
	}

	double area (double length, double breadth) {

	return length*breadth;
	
	}



public static void main (String [] args) {

	MethodOverloading1 func = new MethodOverloading1();

	System.out.println("Area of Circle is: "+func.area(2)+"\n Area of Rectangle: "+func.area(4,2));



}

}