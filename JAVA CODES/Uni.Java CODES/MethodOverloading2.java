public class MethodOverloading2 {
    
  double area (double radius) // circle
  {
    return 3.14*radius*radius;
  }

  int area (int lenght) //square
  {
    return lenght*lenght;
  }

  double area (int base,double height) //triangle
  {
    return 1/2*base*height;
  }

  double area (double lenght,int breadth) // rectangle
  {
    return lenght*breadth; 
  }


    public static void main (String[] args)
    {
        MethodOverloading2 sc = new MethodOverloading2();

        System.out.println("\nCIRCLE:-"+sc.area(69.39)+"\nTRIANGLE:-"+sc.area(5,5.5)+"\nSQUARE:-"+sc.area(56)+"\nREACTNGLE:-"+sc.area(12.5,4));
    
    }
    }

