 import java.util.Scanner;

public class input2 {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.println("enter floatig point");
        float x = sc1.nextFloat();
        boolean b1 = sc1.hasNextInt();
        System.out.println(b1);

        System.out.println("enter the second floating point");
        float y = sc1.nextFloat();

        float sum = x + y;
        System.out.println(sum);


    }
}
