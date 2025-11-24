package features.java8.streamsapi;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> getActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(s-> s.getActivities())
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getActivities());
    }
}
