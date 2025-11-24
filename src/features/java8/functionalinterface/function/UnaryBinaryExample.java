package features.java8.functionalinterface.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase();

    static Comparator<Integer> c = (a,b) -> a.compareTo(b);

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;

    static BinaryOperator<Integer> max = BinaryOperator.maxBy(c);
    static BinaryOperator<Integer> min = BinaryOperator.minBy(c);

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("hello"));
        System.out.println(binaryOperator.apply(1,0));
        System.out.println(max.apply(1,2));
        System.out.println(min.apply(1,2));




    }
}
