class table{
    void printtable(int n){
        for(int i=1; i<=5; i++){
        System.out.println(n* i + "");
        try{
            Thread.sleep(400);
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }
}
class mythread2 extends Thread {
    table t;
    mythread2(table t){
    this.t = t;
    }
    public void run(){
        t.printtable(100);  
    }
}
class mythread1 extends Thread{
    table t;
    mythread1(table t){
        this.t = t;
        }
        public void run(){
            t.printtable(5);  
        }
}
public class threads {
    public static void main(String[] args) {
        table obj = new table();
        mythread1 t1 = new mythread1(obj);
        mythread1 t2 = new mythread1(obj);
        t1.start();
        t2.start();
    }
}
