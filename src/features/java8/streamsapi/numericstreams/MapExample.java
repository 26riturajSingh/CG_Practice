package features.java8.streamsapi.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {

    public static List<Double> mapObject(){
        return IntStream.rangeClosed(1,10)
                .mapToObj((i) -> {
                    return new Double(i);
                })
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println(mapObject());

    }
}
