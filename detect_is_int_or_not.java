 
import java.util.Scanner;

public class detect_is_int_or_not {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any types of number ");
        float a = sc.nextFloat();
        
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    } 
}
