import java.util.Scanner;

public class simpleCalculator 
{
    public static void main(String[] args) 
    {
        double var1, var2,var_power,result1,result2,result3, result4,result5,result6,result7,result8,result9,result10;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        var1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        var2 = scanner.nextInt();

        System.out.println("Enter the power for the numbers: ");
        var_power = scanner.nextInt();

        result1 = var1 + var2;
        result2 = var1 - var2;
        result3 = var1 * var2;
        result4 = var1 / var2;
        result5 = Math.sqrt(var1);
        result6 = Math.sqrt(var2);
        result7 = Math.cbrt(var1);
        result8 = Math.cbrt(var2);
        result9 = Math.pow(var1,var_power);
        result10 = Math.pow(var2,var_power);

        if(var2==0)
        {
            System.out.print("\nThe sum of the two numbers is: " + result1+"\nThe difference of the two numbers is: " + result2+"\nThe product of the two numbers is: " + result3+"\nDivision by zero is not possible\nThe Square root of the first number is: " + result5+"\nThe Square root of the second number is: " + result6+"\nThe Cube root of the first number is: " + result7+"\nThe Cube root of the second number is: " + result8+"\n"+var1+" raised to "+var_power+" is: "+result9+"\n"+var2+" raised to "+var_power+" is: "+result10);
        }

        else
        {
        System.out.println("The sum of the two numbers is: " + result1+"\nThe difference of the two numbers is: " + result2+"\nThe product of the two numbers is: " + result3+"\nThe division of the two numbers is: " + result4+"\nThe Square root of the first number is: " + result5+"\nThe Square root of the second number is: " + result6+"\nThe Cube root of the first number is: " + result7+"\nThe Cube root of the second number is: " + result8+"\n"+var1+" raised to "+var_power+" is: "+result9+"\n"+var2+" raised to "+var_power+" is: "+result10);
        }
        
        scanner.close();
    }
}