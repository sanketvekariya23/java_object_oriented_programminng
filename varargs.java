 
public class varargs {

    static int sum(int...array){
        int result = 0;
        for(int element : array){
            result = result + element ;
        }
        return result ; 
        }

    public static void main(String[] args){
     
        System.out.println("additon two number"+ sum(2,3) );
        System.out.println("additon three number"+ sum(2,3,4) );
        System.out.println("additon five number"+ sum(2,3,4,5,6) );
        System.out.println("additon eight number"+ sum(2,3,4,5,2,4,5,6) );

    }
}
