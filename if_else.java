 import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
      Scanner sc=  new Scanner(System.in);
        System.out.println("enter age for voating");
        int age = sc.nextInt();

    //     if(age>= 18){
    //         System.out.println("you are eligile for voating");

    //     }
    //     else
    //     {
    //         System.out.println("you are not eligible for voating");
    //     }
    // }

        if(age<10 && age > 18)
            System.out.println("youre deparment is 1\n have a good day");
        else if(age>19 && age<50){
                System.out.println("youre deparment is 2\n have a good day");
            }
        else if(age>51 && age<99){
                System.out.println("youre deparment is 3\n have a good day");
            }
   
        else{
            System.out.println("youre deparment is not alloted");
        }
    }
}