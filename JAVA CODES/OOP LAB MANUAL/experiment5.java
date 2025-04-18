import java.util.Scanner;
public class experiment5
{
public static void main (String[] args)
{   
    Scanner sc = new Scanner(System.in);

    // to perform all String functions.

    System.out.println("enter two strings: ");
    String fn = sc.nextLine();
    String ln = sc.nextLine();

    System.out.println(fn.length()+"\n"+fn.substring(1,3)+"\n"+fn.indexOf(2)+"\n"+fn.charAt(1)+"\n"+fn.compareTo(ln)+"\n"+fn.contains("a")+"\n"+fn.equals(ln)+"\n"+fn.equalsIgnoreCase(ln)+"\n"+fn.isEmpty()+"\n"+fn.lastIndexOf("a")+"\n"+fn.toLowerCase()+"\n"+fn.toUpperCase()+"\n"+fn.trim());

    /*
            str.length() for printing the lenght of a string
            str.substring() Returns a string that is a substring of this string.
            str.indexOf() Returns the index within this string of the first occurrence of the specified character.
            str.charAt() Returns the character at the specified index.
            str.compareTo() Compares this string with the specified string.
            str.contains() Returns true if this string contains the specified string.
            str.equals() Compares this string with the specified string.
            str.equalsIgnoreCase() Compares this string with the specified string, ignoring case differences.
            str.isEmpty() Returns true if this string is empty.
            str.lastIndexOf() Returns the index within this string of the last occurrence of the specified character.
            str.toLowerCase() Returns a copy of this string, converted to lowercase.
            str.toUpperCase() Returns a copy of this string, converted to uppercase.
            str.trim() Returns a copy of this string, with leading and trailing whitespace omitted.            
     */

    sc.close();
}
}