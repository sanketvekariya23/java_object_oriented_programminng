 import java.util.Scanner;

public class input {
    public static void main(String[] args){
        System.out.println("talking input from users");
    Scanner sc = new Scanner(System.in);      
    System.out.println("enter the number 1");
    int a = sc.nextInt();
    System.out.println("enter the number2");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println(sum);

    }   
}
