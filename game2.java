 import java.util.Scanner;
import java.util.Random;

public class game2
{
    public static void main(String[] args)
   {

        Scanner sk = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("  enter 1 for rock \n enter 2 for paper and \n enter 3 for scissor");
        int user = sk.nextInt();
        int computer = rand.nextInt(3);

        if(user == computer){
            System.out.println("both are same DRAW!");
        }
        else if( user==1 && computer==3 || user==2 && computer==1 && user==3 && computer==2){
            System.out.println("jiti gyo !");
        }
        else
            {System.out.println("hari gyo bata!");}
        if(computer==1){
            System.out.println("computer choose rock");
        }
        else if(computer==2){
            System.out.println("computer choose paper");
        }
        else if(computer==3){
            System.out.println("computer choose scissor");
        }
    }
}

