/* Functions or methods are a block of code which are used to perform a specific task
  syntax:- 

   return type MethodName(parameters)
    {
        //block of code to be excuted once the Function is called
    }

class HelloWorld
{

  void Display()
  {
    System.out.println("name:Jash JanI\nroll no:-92400957004");
  }

  public static void main(String[] args) {
    HelloWorld sc = new HelloWorld();

    sc.Display();
  }

} 
  
*/

public class Method1
 {

  public void helloWorld ()
  {
    System.out.println("hello world");
  }

  public static void main(String[] args) {
    Method1 sc  = new Method1();

    sc.helloWorld();

  }
 }