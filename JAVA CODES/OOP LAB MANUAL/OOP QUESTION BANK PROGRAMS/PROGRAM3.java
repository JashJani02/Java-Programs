// Create a class Shape that has method overloading for calculating the area of different shapes.

public class PROGRAM3 {
    
    double area (float radius) 
    {
        return 3.14*radius*radius;
    }
    
    double area (double sideLength)
    {
        return sideLength * sideLength;
    }  
    
    double area (double height, double base)
    {
        return 0.5*base*height;
    }
    
    
    public static void main (String [] args) {
        
        PROGRAM3 func = new PROGRAM3();
        
        System.out.println("area of circle: "+func.area(2)+"\narea of square: "+func.area(2.5)+"\narea of triangle: "+func.area(2,3));
        
    }
    
    
}