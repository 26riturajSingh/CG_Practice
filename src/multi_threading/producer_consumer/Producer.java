package multi_threading.producer_consumer;

import java.util.Random;

public class Producer implements Runnable {
    volatile String name;
    volatile boolean running;
    volatile Storage storage;
    public Producer(String name, Storage storage){
        this.name = name;
        this.running = true;
        this.storage = storage;
    }

    public void run(){
        Random r = new Random();
        while(running){
            int data = r.nextInt(100);

            try {
                System.out.println("Producer " + name + " added: " + data);
                storage.addData(data);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public void stop(){
        running = false;
    }
}
