  /*
        
	INHERITANCE:- functions to sccess tghe sttributes of one class to another. This is done with the key-word "extends"
		 
	attributes are tranffered from the parent class to the child class

    public PARENTclass
    {

    // code 

    }

    public CHILDclass extends PARENTclass

    {

    // attributes are now tranferred to the child class from the parent class.

    }

    */

class Zoo
{
  void greet()
  {
    System.out.println("Welcome to the zoo!");
  }
}   
class Animal extends Zoo {
    void sound() {
    System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void bark() {
    System.out.println("YO");
    }
    }

class Cat extends Animal {
    void meow() {
    System.out.println("Meow meow MADARCHOD");
    }
}

    public class experiment22 {

    public static void main(String[] args) {

    Dog d = new Dog();
    Cat c = new Cat();
    Zoo z = new Zoo();

    z.greet();
    d.sound();
    d.bark();
    c.sound();
    c.meow();
    
    }
}