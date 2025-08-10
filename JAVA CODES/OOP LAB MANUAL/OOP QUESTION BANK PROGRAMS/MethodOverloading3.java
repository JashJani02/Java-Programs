// Write a Java program that demonstrates method overloading for a function that calculates the Perimeter of a square, rectangle, and circle.


public class MethodOverloading3 { 

	double perimeter(double sideLength) { 
	return 4*sideLength; 
		
	}

	double perimeter(double length, double breadth) { 
	
		return 2*(length+breadth);

	} 

	double perimeter(long radius) {
	return 3.14*radius*2;

	}


	public static void main (String [] args) {


		MethodOverloading3 func = new MethodOverloading3();

	System.out.println("perimeter of square: "+func.perimeter(4.67)+"\nArea of rectangle: "+func.perimeter(3,2)+"\nArea of Circle: "+func.perimeter(2));

		}


		
	   	  }