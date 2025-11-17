package multi_threading.semaphor_reentrant;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable{
    volatile int count;
    ReentrantLock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    volatile boolean running;
    volatile Random r = new Random();
    Semaphore s = new Semaphore(3);
    public Counter(){
        this.count = 0;
        this.running = true;
    }

    public void run() {
        try {
            s.acquire();
            lock.lock();
            while (running) {
                if (count % 5 == 1) {
                    System.out.println("Divide by 5... AWAITING");
                    while (count % 5 == 1) {
                        c1.await(); // Wait until condition changes
                    }
                } else {
                    System.out.println("Wait over...");
                    c1.signalAll(); // Notify waiting threads
                }

                count++;
                System.out.println(Thread.currentThread().getName() + " : " + count);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
            s.release();
        }
    }

    public void stop(){
        this.running = false;
    }
}
