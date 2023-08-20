 import java.util.Scanner;
public class practice_set {
    public static void main(String[] args) {
        // question :-1
        // int a = 10 ;
        // a++ ;
        // if(a == 11)
        // System.out.println("i am 11");
        // else 
        // System.out.println("i am not 11");

        //  question :- 2
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total no. of subjects \nmaximum 4 subjects is allow");
        int sub = sc.nextInt();

        switch(sub){
            case 1:
            System.out.println("youre marks is youre percentaze");
            break;

            case 2:
            System.out.println("enter sub1 & sub2 marks");
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int perc = (sub1 + sub2) / 2;
            System.out.printf("youre percentaze is %d ",perc);
            if(perc >= 33 )
            System.out.println("pass thay gyo");
            else
            System.out.println("fail thay gyo");

            break;
            case 3:
            System.out.println("enter sub1 , sub2 & sub3 marks");
            int sub11 = sc.nextInt();
            int sub22 = sc.nextInt();
            int sub33 = sc.nextInt();
            int perc1 = (sub11 + sub22 + sub33 ) / 3 ;
            System.out.printf("youre percentaze is %d \n ",perc1);
            if(perc1 >= 33 )
            System.out.println("pass thay gyo");
            else
            System.out.println("fail thay gyo");
            break;

            case 4:
            System.out.println("enter sub1 , sub2,sub3 & sub4 marks");
            int sub111 = sc.nextInt();
            int sub222 = sc.nextInt();
            int sub333 = sc.nextInt();
            int sub444 = sc.nextInt();

            int perc2 = (sub111 + sub222 + sub333 + sub444 ) / 4 ;
            System.out.printf("youre percentaze is %d \n",perc2);
            if(perc2 >= 33 )
            System.out.println("pass thay gyo");
            else
            System.out.println("fail thay gyo");
            break;

        }
        
    }
}
