 
public class array {

    public static void main(String[] args){
        
        // declaration of an array
        // 1. int [] marks = new int [10];
        // 2. int [] marks1;
        //    marks1 = new int [10];
        // 3.  int [] marks2 = {10,20,30,40,50,60,70} ;

    
        // int [] marks = new int[10];
        // marks[0] = 100;
        // marks[1] = 50;
        // marks[2] = 12;
        // marks[3] = 150;
        // marks[4] = 180;
        // System.out.println(marks[4]);

// display using loop 
        int [] marks1 = {10,20,30,40,50,60,70};
// 1.ascending order display
        // System.out.println(marks1.length);
        // for(int i=0; i<=marks1.length; i++){
        //     System.out.println(marks1[i]);
        // }
// 2. decending order display
        // for(int j=marks1.length -1; j>=0; j--){
        //     System.out.println(marks1[j]);
        // }
    
// 3.for each-loop using display    

        for(int element: marks1)
        {
        System.out.println(element);
        }
        // int [] marks2;
        // marks2 = new int[10];
    }
}
