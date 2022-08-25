package multythreading;

public class Example3 {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread1 = new Thread(myRun);
        Thread thread2 = new Thread(myRun);
        Thread thread3 = new Thread(myRun);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRun implements Runnable {
    public synchronized void increment() {
        Counter.count++;
        System.out.println(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
