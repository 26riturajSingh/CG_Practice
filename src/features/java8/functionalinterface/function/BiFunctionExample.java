package features.java8.functionalinterface.function;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static Predicate<Student> predicate = (s -> s.getGradeLevel()>3);

    static BiFunction<List<Student>, Predicate<Student>, Map<String,  Integer>> biFunction = ((s, p) -> {
        Map<String, Integer> map = new HashMap<>();
        s.forEach( i -> {
        if(predicate.test(i)){
            map.put(i.getName(), i.getGradeLevel());
        }});

        return map;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), predicate));
    }
}
