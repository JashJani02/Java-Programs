import java.util.Scanner;
public class switchCase2 
{
    public static void main (String []args)
    {
    int choice;
        double pi= 3.14;

        Scanner scanner = new Scanner (System.in);

    double dimension1,dimension2,radius,result1,result2,result3;

    System.out.println("Enter the choice of which shape's area you would like to calculate:\nPress\n1 for Square\n2 for Rectangle\n3 for Circle\n4 for Triangle\n");
    

    choice = scanner.nextInt();

    switch (choice)
    {
        case 1:
        {
            System.out.println("Enter the side-lenght for the Square: ");
            

            dimension1 = scanner.nextFloat();

            result1 = dimension1*dimension1;

            System.out.println(" The Area of square with side-lenght "+dimension1+" is: "+result1);
            break;

        }

        case 2:
        {
            System.out.println("Enter the length and breadth of the rectangle: ");
            

            dimension1 = scanner.nextFloat();
            dimension2 = scanner.nextFloat();

            result2 = dimension1*dimension2;

            System.out.println("The Area of the rectangle with lenghts "+dimension1+" and "+dimension2+ " is: " +result2);
            break;
        }

        case 3:
        {
            System.out.println("Enter Radius of circle: ");

            radius = scanner.nextFloat();

            result3 = pi*radius*radius;

            System.out.println("The Area of the Circle with radius  "+radius+" is: " +result3);
            break;
        }

        case 4:
        {
            System.out.println("Enter the value of base and height:");

            double height = scanner.nextDouble();
            double base = scanner.nextDouble(); 

            System.out.println("Area of triangle with base "+base+" and height "+height+" is "+0.5*base*height);

            scanner.close();

            break;
        }

        default:
        {
            System.out.println("Invalid Choice");
            break;
            
        }
            
    }
        
    }
}