package multi_threading.producer_consumer;

public class Consumer implements Runnable {
    volatile String name;
    volatile Storage storage;
    volatile boolean running;

    public Consumer(String name, Storage storage){
        this.name = name;
        this.storage = storage;
        this.running = true;
    }

    public void run() {
        try {
            while(running) {
                System.out.println("Consumer " + name + " " + storage.getData());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void stop(){
        this.running = false;
    }
}
