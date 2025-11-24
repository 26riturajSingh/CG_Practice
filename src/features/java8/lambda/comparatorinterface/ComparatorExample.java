package features.java8.lambda.comparatorinterface;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator =  new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(1,2));

        Comparator<Integer> integerComparator = (a,b) -> a.compareTo(b);

        System.out.println(integerComparator.compare(1,2));
    }
}
