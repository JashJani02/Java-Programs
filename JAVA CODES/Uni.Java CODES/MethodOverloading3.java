public class MethodOverloading3
{

    String showDetails(String name)
    {
        return "hi "+name;
    }
    String showDetails(String name, int rollNo)
    {
        return "hi "+name+" ur enrollment is "+rollNo; //"hi "+name"\nur rollNo is "+rollNo;
    }
    String showDetails(String name,int rollNo,String branch)
    {
          return "hi "+name+" ur enrollment is "+rollNo+" ur branch is "+branch;
    }
    String showDetails(String name, int rollNo,String branch,String stream)
    {
       return  "hi "+name+"ur enrollment is "+rollNo+" ur branch is "+branch+" u r from "+stream;
    }

    public static void main(String[] args) {

        MethodOverloading3 sc = new MethodOverloading3(); 


        System.out.println(""+sc.showDetails("Jash\n ")+sc.showDetails("Abdul ", 35)+sc.showDetails("\nAbdul ", 35, " CSE "));

    }


}