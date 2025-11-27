package features.java8.optional;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample3 {

    public static void filter(){
        Optional<Student> studentOptional = Optional.of(StudentDataBase.getAllStudents().getFirst());

        studentOptional.filter(s -> s.getGpa()>2.5)
                .ifPresent(System.out::println);
    }

    public static void map(){
        Optional<Student> studentOptional = Optional.of(StudentDataBase.getAllStudents().getFirst());

        Map<String, Integer> map = new HashMap<>();
        studentOptional.map( (s) -> {
                    map.put(s.getName(), s.getGradeLevel());
                    return map;
                })
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        filter();
        map();
    }
}
