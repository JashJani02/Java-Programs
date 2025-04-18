import java.util.Scanner;

public class experiment_4 {
    
    public static void main(String[] args) {
        
            double num1,num3,num2;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number: ");

            
            num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            

            num2 = scanner.nextDouble();
            
            System.out.println("Enter the third number: ");
        
            num3 = scanner.nextDouble();

            if (num1>num2 && num1>num3)
            {
            System.out.println("The maximum value is :"+num1);
            }

            else if (num2>num1 && num2>num3)
            {
                System.out.println("The maximum value is :"+num2);
            }

            else 
            {
                System.out.println("The maximum value is :"+num3);
            }

            scanner.close();
            
        }
    }