 
import java.util.Scanner;

// taken marks of 5 student and convert percentile

public class exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subjects marks\n 1. Enter data structure marks \n 2. Enter database management system marks \n 3. Enter etc marks. \n 4. Enter ps marks . \n 5. Enter java marks\n");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println("the sum of all subjects marks is");
        float sum = a + b + c + d + e;
        System.out.println(sum);
        System.out.println("the precentage of marks");
        float perc = sum * 100 / (100 * 5) ;
        System.out.println(perc);
    }    
}
