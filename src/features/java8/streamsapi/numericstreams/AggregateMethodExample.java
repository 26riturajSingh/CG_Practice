package features.java8.streamsapi.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateMethodExample {
    public static void main(String[] args) {
        double d = IntStream.rangeClosed(0,50).asDoubleStream().sum();
        System.out.println("DOUBLE : " + d);

        OptionalDouble optionalDouble = IntStream.range(0,5).asDoubleStream().max();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : "NONE");

        OptionalLong optionalLong = LongStream.range(99,10000).min();
        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : "NONE");




    }
}
