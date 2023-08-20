 import java.util.Scanner;
public class income_tax_calculate {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter youre income in lakhs");
        float income = sc.nextFloat();
        float tax = 0 ;
        if(income < 2.5){
            tax = tax + 0;
        }
        else if(income >=2.5f && income<5.0f){
            tax = tax + 0.05f *(income-2.5f);
        }
        else if(income >=-5.0f && income<10.0f){
            tax = tax + 0.05f *(5.0f - 2.5f );
            tax =tax + 0.20f *(income-5.0f);
        }
        else if(income>=10.0f){
            tax = tax + 0.05f *(5.0f - 2.5f);
            tax = tax + 0.20f *(10.f -5.0f);
            tax = tax + 0.30f *(income - 10.0f );
        }
        System.out.printf("total income tax is  " + tax);

    }

}

// 2.5-5.0    5  %
// 5- 10      20 %
// above10    30 %