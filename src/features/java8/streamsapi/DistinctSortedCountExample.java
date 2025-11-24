package features.java8.streamsapi;

import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DistinctSortedCountExample {
    public static List<String> getDistinctSortedActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(s-> s.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                })
                .collect(Collectors.toList());
    }

    public static Long getDistinctCountActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(s-> s.getActivities())
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(getDistinctSortedActivities());
        System.out.println(getDistinctCountActivities());
    }
}
