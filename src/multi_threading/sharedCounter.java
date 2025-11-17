package multi_threading;

class MyThread implements Runnable{
    Counter counter;
    int incrementCount;

    public MyThread(Counter counter, int incrementCount){
        this.counter = counter;
        this.incrementCount = incrementCount;
    }

    @Override
    public void run(){
        while(incrementCount>0){
//            System.out.println();
            counter.increment();
//            System.out.print(counter.getCount() + " ");
            incrementCount--;
        }
    }
}

class Counter{
    int c = 0;

    public void increment(){
        c++;
    }

    public int getCount(){
        return c;
    }

}

public class sharedCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int i = 100;
        Thread[] arr = new Thread[6];

        for(int j = 0; j<6; j++){
            arr[j] = new Thread(new MyThread(counter, i));
            arr[j].start();
        }

        for(int j=0; j<6; j++){
            arr[j].join();
        }

        System.out.println(counter.getCount());




    }
}
