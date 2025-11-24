package features.java8.streamsapi;

import features.java8.functionalinterface.supplier.SupplierExample;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SreamOfIterateGenerateExample {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("a", "b", "c");
        s1.forEach(System.out::println);

        Stream.iterate(1, x->x*2)
                .limit(5)
                .forEach(System.out::println);

        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier).limit(10).forEach(System.out::println);
    }
}
