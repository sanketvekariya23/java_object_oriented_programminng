 
import java.util.Scanner;
public class recursion {

    static int factorial(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        else{
            int result;
            return result = x * factorial(x-1);
        }
        
    }
static int itretive_factorial(int n){
    int product = 1;
    for(int i=1; i<=n; i++){
        product = product * i ;
    }
    return product ;
}
    public static void main(String[] args) {
        // recursion is technic in wich function is calling it by self
        // factorial 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which you want to find factorial");
        int n = sc.nextInt();
        System.out.println("the factorial value is :-     " + factorial(n));
        System.out.println("the factorial value is :-     " + itretive_factorial(n));
    }
}
