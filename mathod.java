 public class mathod {
    static void function(){
        System.out.println("hello sanket!");
    }
    static int sum (int x , int y){
        int c = x + y ;
        System.out.println(c);
         x= 544 ;
         y = 544 ;
        return c;
    }
    static void foo(){
        System.out.println("hello");                    // same name of function but argument is diffrent !  /foo / 
    }
    static void foo(int x){
        System.out.println("hello");
        x = 255;
        System.out.println(x);
    }
    static void foo(int x, int y){
        System.out.println("hello");
        x = 255;
        y = 255 ;
        System.out.println(x);
        System.out.println(y);
    }


    
    public static void main(String[] args){
           int a =4;   int a1 = 54;
           int b = 5;  int b1 = 522;                                       // mathod is one type of function in c
        function();
        sum(a,b);
        sum(a1 ,b1);                // we can call function any number of the time 
        System.out.println(a);
        System.out.println(b);
        foo();
        foo(a1);
        foo(b1);
        
    }
}
