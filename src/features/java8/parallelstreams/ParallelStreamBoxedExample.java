package features.java8.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static void sequentialSum(List<Integer> list){
        long start = System.currentTimeMillis();
        int sum = list.stream()
                .reduce(0, (x,y) -> x+y);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void parallelSum(List<Integer> list){
        long start = System.currentTimeMillis();
        int sum = list.stream()
                .parallel()
                .reduce(0, (x,y) -> x+y);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1,50)
                                    .boxed()
                                    .collect(Collectors.toList());
        sequentialSum(list);
        parallelSum(list);
    }
}
