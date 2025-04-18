public class Method4
{
    double add (double num1, double num2)
    {
        return num1+num2;
    }

    double subtract (double num1, double num2)
    {
        return num1-num2; 
    }

    double multiply (double num1, double num2)
    {
        return num1*num2;
    }

    double quotient (double num1, double num2)
    {
        return num1/num2;
    }

    double modulo(double num1, double num2)
    {
        return num1%num2;
    }

    double square1 (double num1)
    {
        return num1*num1;
    }

    double square2 (double num2)
    {
        return num2*num2;
    }

    double squareRoot1 (double num1)
    {
        return Math.sqrt(num1);
    }

    double squareRoot2 (double num2)
    {
        return Math.sqrt(num2);
    }

    double cubeRoot1 (double num1)
    {
        return Math.cbrt(num1);
    }

    double cubeRoot2 (double num2)
    {
        return Math.cbrt(num2);
    }

    double cube1(double num1)
    {
        return num1*num1*num1;
    }

    double cube2 (double num2)
    {
        return num2*num2*num2;
    }

    public static void main (String[] args)
    {
        Method4 sc = new Method4 ();

        System.out.println("Sum= "+sc.add(4,5)+"\nDifference= "+sc.subtract(4,5)+"\nProduct= "+sc.multiply(4,5)+"\nQuotient= "+sc.quotient(4,5)+"\nSquare= "+sc.square1(4)+"\nSquare= "+sc.square2(5)+"\nSquare Root= "+sc.squareRoot1(4)+"\nCube Root= "+sc.cubeRoot1(4)+"\nCube= "+sc.cube1(4)+"\nCube= "+sc.cube2(5)+"\nModulo= "+sc.modulo(4,5)); 
    }
}