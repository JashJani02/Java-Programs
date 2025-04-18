public class experiment_5 

{ 

    /*
        All string functions

        1. charAt()           this is used for finding the character at the given index
        2. compareTo()        this is used for comparing the string
        3. concat()           this is used for concatenating the string
        4. contains()         this is used for checking the substring
        5. endsWith()         this is used for checking the ending of the string
        6. equals()           this is used for checking the equality of the string
        7. equalsIgnoreCase() this is used for ignoring the case of the string
        8. indexOf()          this is used for finding the index of the string
        9. isEmpty()          this is used for checking the string is empty or not
        10. lastIndexOf()     this is used for finding the last index of the string
        11. length()          this is used for finding the length of the string
        12. replace()         this is used for replacing the string
        13. split()           this is used for splitting the string
        14. startsWith()      this is used for checking the starting of the string
        15. substring()       this is used for extracting the substring
        16. toLowerCase()     this is used for converting the string to lower case
        17. toUpperCase()     this is used for converting the string to upper case
        18. trim()            this is used for removing the white spaces from the string

     */


    public static void main (String[]args)
    {
        String str1 = "Jash";
        String str2 = "Aatman"; //hehehehe

        System.out.println("Char.at = "+str1.charAt(0)+"\n"+str2.charAt(0)+"\n"+str1.compareTo(str2)+"\n"+str1.concat(str2)+"\n"+str1.contains("Jash")+"\n"+str1.endsWith("h")+"\n"+str1.equals(str2)+"\n"+str1.equalsIgnoreCase(str2)+"\n"+str1.indexOf("J")+"\n"+str1.isEmpty()+"\n"+str1.lastIndexOf("J")+"\n"+str1.length()+"\n"+str1.replace("J","A")+"\n"+str1.split("a")+"\n"+str1.startsWith("J")+"\n"+str1.substring(0,2)+"\n"+str1.toLowerCase()+"\n"+str1.toUpperCase()+"\n"+str1.trim());
    }
}
