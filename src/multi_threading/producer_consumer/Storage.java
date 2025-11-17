package multi_threading.producer_consumer;

import java.util.ArrayDeque;
import java.util.Deque;

public class Storage {
    Deque<Integer> integerDeque = new ArrayDeque<>(10);

    public synchronized void addData(int data) throws InterruptedException {
        if(integerDeque.size() == 10){
            System.out.println("Waiting for resource release");
            wait();
        }
        integerDeque.add(data);
        notifyAll();
    }

    public synchronized int getData() throws InterruptedException {
        if(integerDeque.isEmpty()){
            System.out.println("Waiting for resource allocation");
            wait();
        }
        int d = integerDeque.pop();
        notifyAll();
        return d;

    }

}
