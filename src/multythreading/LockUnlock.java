package multythreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockUnlock {
    public static void main(String[] args) {
        Call call = new Call();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsappCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private Lock locker = new ReentrantLock();

    void mobileCall() {
        locker.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    void skypeCall() {
        locker.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    void whatsappCall() {
        locker.lock();
        try {
            System.out.println("Whatsapp call starts");
            Thread.sleep(7000);
            System.out.println("Whatsapp call ends");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            locker.unlock();
        }
    }
}
