public class Constructor1
{   
    
    String name;
    int rollNo;
     Constructor1()
    {
        System.out.println("\nDefault Constructor");
        this.name = "Jash Jani";
        this.rollNo = 004;
        System.out.println("Name:- "+name+"\nRoll no:- "+rollNo);
    }

    Constructor1 (String name, int rollNo)
    {
        System.out.println("\nParameterized constructor");
        this.name = name;
       this.rollNo = rollNo;

        System.out.println("Name:- "+name+"\nRoll no:- "+rollNo);
    }

    public static void main(String[] args) {
    
        Constructor1 cons = new Constructor1();
        Constructor1 cons2 = new Constructor1("Jash Jani", 004);

        System.out.println("\n"+cons2.name);
        System.out.println("\n"+cons.rollNo);
        
    }
}

/* Constructor
      
Constructor is a special type of method which is used to initialize the object
     
      syntax:- ConstructorName()
            {
                //block of code to be excuted once the constructor is called
            }        
      
      
      
Constructor overloading is a feature of java which allows us to create multiple constructors with different parameters
       
      syntax:- ConstructorName(parameter1, parameter2)
            {
                //block of code to be excuted once the constructor is called
            }        
       
              ConstructorName(parameter1, parameter2, parameter3)
            {
                //block of code to be excuted once the constructor is called
            }        
      
     We can call the constructor by using new keyword followed by constructor name
     
        ConstructorName objectName = new ConstructorName(parameter1, parameter2);
      
        ConstructorName objectName = new ConstructorName(parameter1, parameter2, parameter3);
      
     we can print its attributes by using "this" keyword 
 
*/