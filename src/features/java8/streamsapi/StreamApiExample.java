package features.java8.streamsapi;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiExample {

    static Predicate<Student> p = (s) -> s.getGradeLevel()>3;

    public static void main(String[] args) {
        Map<String, List<String >> map = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println)
                .filter(p)
                .peek((s)-> {
                    System.out.println("After 1st filter: " + s);
                })
                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        return student.getGpa()>2.5;
                    }
                })
                .peek((s)-> {
                    System.out.println("After 2nd filter: " + s);
                })
                .collect(Collectors.toMap(
                        s -> s.getName(),        // Lambda for key
                        s -> s.getActivities()
                ));

        System.out.println(map);
    }
}
