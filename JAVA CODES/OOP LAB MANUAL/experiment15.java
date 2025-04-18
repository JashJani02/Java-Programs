public class experiment15 {
    public static void main(String[] args) {

    int N = 5,sum=0,oddNumber=1; 

    for (int i = 1; i <= N; i++) 
    {
        sum += oddNumber; 
        oddNumber += 2; 
    }

    System.out.println("Sum of first "+ N +" odd numbers: "+sum);

}
}    