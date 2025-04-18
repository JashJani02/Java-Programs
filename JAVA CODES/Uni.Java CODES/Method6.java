public class Method6
{

    void areaOfCircle()
    {   
        double  pi = 3.14;
        double radius = 2;
        double result3 = pi * radius * radius;

        System.out.println("area is = "+result3);
    }

    void areaOfSquare(double sideLenght)
    {
        double result = sideLenght*sideLenght;
        System.out.println("area is = "+result);
    }

    double areaOfTriangle(double base, double height)
    {
        double result1 = .05*base*height;

        return result1;
    }

    double areaOfRectangle()
    {
        double base = 6;
        double height = 2;

        return base*height;
    }

public static void main (String[] args)
{
    Method6 sc = new Method6 ();
    sc.areaOfCircle();
    sc.areaOfSquare(69);
    System.out.println("area of Rectangle is ="+sc.areaOfRectangle()+"\nArea of Triangle = "+sc.areaOfTriangle(2, 4));   
}
}