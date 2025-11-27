package features.java8.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long timeTaken(Supplier<Integer> supplier, int n){
        long start = System.currentTimeMillis();
        for(int i=0; i<n; i++){
            supplier.get();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static int sequenialStream(){
        return IntStream.rangeClosed(1,1000).sum();
    }

    public static int parallelSream(){
        return IntStream.rangeClosed(1,1000).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println("Sequential : " + timeTaken(ParallelStreamExample::sequenialStream, 20 ));
        System.out.println("Parallel : " + timeTaken(ParallelStreamExample::parallelSream, 20 ));

    }
}
