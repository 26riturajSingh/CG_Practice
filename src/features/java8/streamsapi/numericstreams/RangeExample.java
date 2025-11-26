package features.java8.streamsapi.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeExample {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1,50).count());

        IntStream.rangeClosed(1,50).asLongStream().forEach(s -> System.out.print(s + ", "));
        System.out.println();
        LongStream.range(1,20).asDoubleStream().forEach(s -> System.out.print(s + ", "));

    }
}
