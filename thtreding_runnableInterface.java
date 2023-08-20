class Threads1 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("111111111111");
            i++;
        }
    }
}

class Threads2 implements Runnable {
    
    public void run() {
        int j = 0;
        while (j <= 100) {
            System.out.println("2222222222222");
            j++;
        }
    }
}

class ThreadingRunnableInterface {
    public static void main(String[] args) {
        // threading with Runnable interface, first make interface then implement
        Threads1 bullet1 = new Threads1();
        Thread gun1 = new Thread(bullet1);

        Threads2 bullet2 = new Threads2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
