 import java.util.Scanner;
import java.util.Random;

class game{
    int number;
    int noOfGuesses = 0 ;
    int inputNumber;

    game(){
        Random rand =new Random();
        number = rand.nextInt(100);
    }
    void takeInputUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("guess the number!");
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses ++;
        if(number == inputNumber){
            System.out.print("yes you guess right number ! ");
            System.out.format("in number of try %d", noOfGuesses);
            return true;
        }
        else if(number > inputNumber){
            System.out.println("low number ");
        }
        else if(number < inputNumber){
            System.out.println("high number ");
        }
        return false;
    }
}

public class game1 {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){
            g.takeInputUser();
            b = g.isCorrectNumber();   
        }
    }
}
