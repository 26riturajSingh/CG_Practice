package multi_threading.producer_consumer;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Storage s = new Storage();
        Producer x1 = new Producer("One", s);
        Thread p1 = new Thread(x1);
        Producer x2 = new Producer("Two", s);
        Thread p2 = new Thread(x2);
        p1.start();
        p2.start();
        Consumer x3 = new Consumer("First", s);
        Thread c1 = new Thread(x3);
        c1.start();
        Consumer x4 = new Consumer("Second", s);
        Thread c2 = new Thread(x4);
        c2.start();
        Consumer x5 = new Consumer("Third", s);
        Thread c3 = new Thread(x5);
        c3.start();


        Thread.sleep(10000);
        x1.stop();
        x2.stop();
        x3.stop();
        x4.stop();
        x5.stop();
    }
}
