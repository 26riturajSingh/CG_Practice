package features.java8.streamsapi.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> l){
        return l.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> list = boxing();
        System.out.println(list);

        System.out.println(unboxing(list));

    }
}
