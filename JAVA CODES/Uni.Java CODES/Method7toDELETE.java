public class Method7toDELETE
{

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
        return (base1+base2)*height/2;
    }

    double areaOfRhombus(double diagonal1, double diagonal2)
    {
        return diagonal1*diagonal2/2;
    }


public static void main (String[] args)
{
    Method7toDELETE obj = new Method7toDELETE ();

    System.out.println("area of cube is "+obj.areaOfCube(2)+"\narea of cuboid is "+obj.areaOfCuboid(2, 3, 4)+"\narea of trapezium is "+obj.areaOfTrapezium(2, 3, 4)+"\narea of rhombus is "+obj.areaOfRhombus(2, 3));

}
}