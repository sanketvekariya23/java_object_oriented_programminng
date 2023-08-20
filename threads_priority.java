class threadspriority extends Thread{
    public threadspriority(String Name){
        super(Name);  // threadspriority constructor
    }
    public void run(){
        int i=0;
        while(i<300){
            System.out.println("i am prioritize class/.");
        }
    }
}
public class threads_priority {
    public static void main(String[] args) {
        threadspriority tp1= new threadspriority("sanket");
        threadspriority tp2= new threadspriority("uttam");
        threadspriority tp3= new threadspriority("jigo");
        threadspriority tp4= new threadspriority("urvish");
        threadspriority tp5= new threadspriority("keval");

        tp1.setPriority(Thread.MAX_PRIORITY);
        tp2.setPriority(Thread.MIN_PRIORITY);

        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();
    }
}
