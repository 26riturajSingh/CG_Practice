package multi_threading.semaphor_reentrant;

import java.util.concurrent.Semaphore;

public class SemaphorExample {
    public static void main(String[] args) throws InterruptedException {


        Counter c = new Counter();

        Thread t1 = new Thread(c, "t1");
        t1.start();
        Thread t2 = new Thread(c, "t2");
        t2.start();
        Thread t6 = new Thread(c, "t6");
        t6.start();
        Thread t5 = new Thread(c, "t5");
        t5.start();
        Thread t4 = new Thread(c, "t4");
        t4.start();
        Thread t3 = new Thread(c,"t3");
        t3.start();

        Thread.sleep(5000);

        t1.join();
        t6.join();
        t5.join();
        t4.join();
        t3.join();
        t2.join();

        c.stop();

    }
}
