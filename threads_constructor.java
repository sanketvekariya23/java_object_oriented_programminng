class threads extends Thread{
    public threads(String name){
        // allocate the new name of  a thread
        super(name);
    } 

    @Override

    public void run(){
        int i = 0;
        while(i <= 200){
            System.out.println("I am threads");
            i++;
        }
     }
    
}


public class threads_constructor {
    public static void main(String[] args) {
        threads t1 = new threads("sanket");
        t1.start();
    }
}
