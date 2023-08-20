import java.util.Scanner;

public class switch1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr character");
        String str = sc.nextLine();

        switch(str){
            case "sanket":
            System.out.println("youre enrollment no. is :- 210160107008");
            break;
            case "raj":
            System.out.println("youre enrollment no. is :- 210160107064");
            break;
            case "ravi":
            System.out.println("youre enrollment no. is :- 210160107007");
            break;
            case "a":
            System.out.println("enrolment no. 1 to 20 is in batch a");
            break;
            default:
                System.out.println("enter only batch 1 student data");
            
            
        }
    }
}
