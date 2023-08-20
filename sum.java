 

    // sum of three number
    import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number\n 1. enter 1 st number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter a third number ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println(sum);
    }
}
