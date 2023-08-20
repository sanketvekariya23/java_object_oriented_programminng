 public class practice_set1{
    public static void main(String[] args){
            // problem 1


        /*   float [] marks ={45.6f,455.8f,554.55f,0.00f,458.66f};
            float sum = 0 ;
            for(float element : marks){
            sum =  sum + element ;
            
        }
            System.out.println("the total marks is" + sum);       

             //problem :2

            float [] marks ={45.6f,455.8f,554.55f,0.00f,458.66f};
            float num= 45.6f;
            for(float element : marks){
                if(num == element)
                {
                    System.out.println("found the number " + num);
                }
            }
           

            //problem :3
           float [] marks ={45.6f,455.8f,554.55f,0.00f,458.66f};
            float sum = 0; 
            for(float element : marks){
                sum = sum + element ;
            }
            float avg = sum / 5 ;
            System.out.println("the averege of the number is " + avg); 
            
            // problem : 4
            // reverse of an array

            int []arr = {10,20,30,40,50,60,70,80,90,100};
            for(int i=arr.length -1 ; i!=0; i--){
                System.out.println(arr[i]);
            } x 
            
            // problem :5 
            // find maximum number of an array
            
            int [] arr = {10,20,40,80,555,4};
            int max = 0;
            for(int element : arr){
                if(element > max){
                    max = element ;
                }
            }
            System.out.println("the maximum number of an array is : " + max); 

            // problem : 6
            // find given array is shorted or not !
            boolean isSorted = true ;
            int [] arr = {9,8,7,6,5,4,3,2,1};
            // arr[i] > arr[i+1]
            for (int i=0; i<arr.length-1; i++){
                if (arr[i] < arr[i+1]){
                    isSorted = false ;
                }

            }
           if(isSorted == false){
            System.out.println("given array is not sorted");
        }
        else{
            System.out.println("given array is  sorted");
        } */

        // problem : 7 
        // reverse array
         // arr[i]  swap arr.length-i-1 

        int [] arr = {10,60,80,70,60};
        int n = Math.floorDiv(arr.length,2);
        int temp;
        for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1 ]= temp;
        }
        for(int element : arr){
            System.out.println(element);
        }
    }

}