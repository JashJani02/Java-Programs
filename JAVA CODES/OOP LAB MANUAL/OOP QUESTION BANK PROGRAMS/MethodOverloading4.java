// Implement a program that overloads a method to concatenate two strings and also concatenate three strings.

public class MethodOverloading4 {

	void stricn (String str1, String str2) {

	String result = str1+str2;

	System.out.println(" "+result);	

}
    
    void stricn(String str1, String str2, String str3) {
        
        String result = str1+str2+str3;
        
        System.out.println(" "+result);
    }

	public static void main (String [] args) {

		MethodOverloading4 func = new MethodOverloading4();
		
		func.stricn("Jash","Jani");
		func.stricn("Jash","Paritosh","Jani");

}
}