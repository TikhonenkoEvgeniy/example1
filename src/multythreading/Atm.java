package multythreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Atm {
    public static void main(String[] args) {
        Lock locker = new ReentrantLock();
        new Employee("Eugene", locker);
        new Employee("Mariya", locker);
        new Employee("Andrey", locker);
        new Employee("Olga", locker);
    }
}
class Employee extends Thread {
    private final String name;
    private final Lock locker;

    public Employee(String name, Lock locker) {
        this.name = name;
        this.locker = locker;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting");
            locker.lock();
            System.out.println(name + " is going");
            Thread.sleep(2000);
            System.out.println(name + " had finished");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            locker.unlock();
        }
    }
}
