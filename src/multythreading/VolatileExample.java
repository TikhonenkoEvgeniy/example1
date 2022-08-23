package multythreading;

public class VolatileExample extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.start();
        sleep(3000);
        System.out.println("After 3 seconds wake up");
        volatileExample.b = false;
        volatileExample.join();
        System.out.println("End of program");
    }
}
