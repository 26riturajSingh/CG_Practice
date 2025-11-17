package multi_threading;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread producer = new Thread(() -> {
            String msg = "P1";
            System.out.println("Producer: " + msg);
            try {
                String resp = exchanger.exchange(msg);
                System.out.println("Producer: " + resp);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            String msg = "C1";
            System.out.println("Consumer: " + msg);
            try {
                String resp = exchanger.exchange(msg);
                System.out.println("Consumer: " + resp);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
