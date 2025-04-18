import java.util.Scanner;
public class Method3 {
    
    Scanner sc = new Scanner(System.in);

    double areaOfCircle (double radius)
    {
     //   System.out.println("Ur Calcuating da area of a Circle\nEnter the value of the radius of the circle:");

        return 3.14*radius*radius; 
    }

    double areaOfSquare (double sideLength)
    {
       // System.out.println("Ur Calcuating da area of a Square\nEnter the value of the side-lenght of the Square:");
  
        return sideLength*sideLength;
    }

    double areaOfTriangle (double base, double height)
    {
      //  System.out.println("Ur Calcuating da area of a Triangle\nEnter the values of the Triangle's Base and Height");
     
        return  0.5*base*height; 
    }

    double areaOfCube(double sideLenght)
    {
        return sideLenght*sideLenght*sideLenght;
    }
    
    double areaOfCuboid(double lenght, double width, double height)
    {
        return lenght*width*height;
    }   

    double areaOfTrapezium(double base1, double base2, double height)
    {
        return 0.5*(base1+base2)*height;
    }

    double areaOfRhombus(double diagonal1, double diagonal2)
    {
        return diagonal1*diagonal2/2;
    }

    double areaOfSphere(double radius)
    {
        return 4*3.14*radius*radius*radius;
    }

    double areaOfCylinder(double radius, double height)
    {
        return 2*3.14*radius*radius*height;
    }

    double areaOfParallelogram(double base, double height)
    {
        return base*height;
    }

    double areaOfHemisphere(double radius)
    {
        return 3*3.14*radius*radius;
    }

    public static void main(String[] args) {
        double result = 0;
        String shape = "";
        
        Scanner sc = new Scanner(System.in);
        Method3 calc = new Method3();

        int choice;
        double input1,input2,input3;
        System.out.println("Area-calculator\nType 1 for finding the area of a Circle\nType 2 for finding the area of a Square\nType 3 for finding the area of a Triangle\nType 4 for finding the area of a Cube\nType 5 for finding the area of a Cuboid\nType 6 for finding the area of a Trapezium\nType 7 for finding the area of a Rhombus\nType 8 for finding the area of a Sphere\nType 9 for finding the area of a Cylinder\nType 10 for finding the area of a Parallelogram\nType 11 for finding the area of a Hemisphere\n");

        choice = sc.nextInt();

        switch(choice)
        {
            case 1:
            {   shape = "Circle";
                System.out.println("enter the value of the radius: ");
                input1 = sc.nextDouble();
                result = calc.areaOfCircle(input1);
                break;
            }

            case 2:
            {   shape = "Square";
                System.out.println("Enter the value of the side-lenght: ");
                input1 = sc.nextDouble();
                result = calc.areaOfSquare(input1);
                break;
            }

            case 3:
            {   shape = "Triangle";
                System.out.println("Enter the value of the base and height: ");
                input1 = sc.nextDouble();
                input2 = sc.nextDouble();
                result = calc.areaOfTriangle(input1, input2);
                break;
            }

            case 4:
            {   shape = "Cube";
                System.out.println("Enter the value of the side-lenght: ");
                input1 = sc.nextDouble();
                result = calc.areaOfCube(input1);
                break;
            }

            case 5:
            {   shape = "Cuboid";
                System.out.println("enter the values of the Lenght, breadth and height:");
                input1 = sc.nextDouble();
                input2 = sc.nextDouble();
                input3 = sc.nextDouble();
                result = calc.areaOfCuboid(input1, input2, input3);
                break;
            }

            case 6:
            {   shape = "Trapezium";
                System.out.println("Enter the values of the base1, base2 and height: ");
                input1 = sc.nextDouble();
                input2 = sc.nextDouble();
                input3 = sc.nextDouble();
                result = calc.areaOfTrapezium(input1, input2, input3);
                break;
            }

            case 7:
            {   shape = "Rhombus";
                System.out.println("Enter the values of the diagonal1 and diagonal2: ");
                input1 = sc.nextDouble();
                input2 = sc.nextDouble();
                result = calc.areaOfRhombus(input1, input2);
                break;
            }

            case 8:
            {   shape = "Sphere";
                System.out.println("Enter the value of the radius: ");
                input1 = sc.nextDouble();
                result = calc.areaOfSphere(input1);
                break;
            }

            case 9:
            {   shape = "Cylinder";
                System.out.println("Enter the values of the radius and height: ");
                input1 = sc.nextDouble();
                input2 = sc.nextDouble();
                result = calc.areaOfCylinder(input1, input2);
                break;
            }

            case 10:
            {   shape  = "Parallelogram";
                System.out.println("Enter the values of the base and height: ");
                input1 = sc.nextDouble();   
                input2 = sc.nextDouble();
                result = calc.areaOfParallelogram(input1, input2);
                break;
            }

            case 11:
            {   shape = "Hemisphere";
                System.out.println("Enter the value of the radius: ");
                input1 = sc.nextDouble();
                result = calc.areaOfHemisphere(input1);
                break;
            }

            default:
            {
                System.out.println("Invalid input");
              
            }
        }
        sc.close();
        
       System.out.println("area of the "+shape+" is \n "+result);
    }       
}