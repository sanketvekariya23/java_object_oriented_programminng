
class multithreads1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("i am inheritance threads11111111111");
            i++;
        }
    }
}

class multithreads2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("i am inheritance threads2222222222");
            i++;
        }
    }
}
public class threading_inheritence {
    public static void main(String args[]) {
        multithreads1 m1 = new multithreads1();
        multithreads2 m2 = new multithreads2();

        m1.start();
        m2.start();
    }
}
