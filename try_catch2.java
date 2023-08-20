import java.util.InputMismatchException;
import java.util.Scanner;
public class try_catch2 {
    // You are writing a program that reads an integer
    // value from the user. However, the user might accidentally 
    // enter a non-integer value. To handle this, you want to use 
    // a try-catch block to catch the exception and handle it 
    // gracefully. 
    public static void main(String[] args){
      while(true){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a integer number");
            int x = sc.nextInt();          
        }catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("invalid input only integer is allowed");
        }
    }
}
}
