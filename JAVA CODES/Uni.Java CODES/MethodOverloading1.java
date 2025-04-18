 public class MethodOverloading1 {

    int addition(int a,int b)
        {
            return a+b;
        }

        double addition(double a, double b)
        {
            return a+b;
        }

        double addition(double a, double b, double c)
        {
            return a+b+c;
        }     
    public static void main (String[] args)
    {
        MethodOverloading1 sc = new MethodOverloading1 ();

        System.out.println("\nSum of the two numbers:- "+sc.addition(12, 45)+"\nSum of the two numbers:- "+sc.addition(12, 45.45)+"\nSum of the three numbers:- "+sc.addition(12.69, 45.69,69.69));
    
    }
    } 
