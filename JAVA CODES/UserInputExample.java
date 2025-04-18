import java.util.Scanner;
    public class UserInputExample
    {
 /*
 Scanner is used to get the input from the user
  "import java.util.Scanner"; is used to import the Scanner class from the java.util package
  Scanner sc = new Scanner(System.in); is used to create an object of the Scanner class
*/
        public static void main(String[] args) 
        {
             Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello,"+name+" Hope your fine");

            System.out.println("Enter an Integer:");
            int number = scanner.nextInt();
            System.out.println("You enter this number:" +number+", as your input");

            System.out.println("Enter a Floating Point Number:");
            float newNumber = scanner.nextFloat();
            System.out.println("You entered this Floating Point Number:"+newNumber+", as your input");

            System.out.println("enter a character:");
            char character = scanner.next().charAt(0); 
            //checks for a character at the given index (in this case '0' is the first index. the function works as if the data type is a string)
            System.out.println("You entered this Character:"+character+", as your input");
            
             scanner.close();
        }
    }