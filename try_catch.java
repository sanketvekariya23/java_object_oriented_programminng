import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        // exeption handling
        Scanner sc = new Scanner(System.in);
        while(true){
        try{
            System.out.println("enter the number ");
            int x = sc.nextInt();
            System.out.println("enter second number ");
            int y = sc.nextInt();
            System.out.println("division is : " + x/y);
        }catch(Exception e){
          System.out.println("enter valid statement or valid number");

        }
        System.out.println("try_catch is runnning");
        }
    }
}
