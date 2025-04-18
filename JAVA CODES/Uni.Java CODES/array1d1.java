public class array1d1
{
/*
    Arrays:- linear data structure which holds the collection of variables of the same data-type

    to iterate to a 1D array, we use the for loop
    to iterate to a 2D array, we nested for loops

    syntax:

        dataType[] arrayName = new dataType[size];
        // or
        dataType[] arrayName = {value1, value2, ..., valueN};

    iteration of a 1D array:

        for (dataType variableName : arrayName)
        {
            
        }

    iteration of a 2D array:



    
 */
public static void main (String[] args)
{
    int[] arr = {1,4,9,16,25,36,49,64,81,100};

    for (int i : arr) {
        System.out.println(i);
    }

    String[] names = {"Jash","Aryan","Krutarth","Preet"};

    for (String string : names) {
        System.out.println(string);
    }
}
}