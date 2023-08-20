import java.util.Scanner;
public class factorial_loop {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the number which you want to factorial");
     int n = sc.nextInt();
     int factorial = 1;

// sum is intilize with 0 and product is intilize with 1

    // factorial  5! = 5*4*3*2*1
        for(int i=1; i<=n; i++){
            factorial = factorial* i;
        }
        System.out.println(factorial);
    }
}
