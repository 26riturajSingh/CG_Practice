package features.java8.functionalinterface.function;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {

    static Predicate<Student> predicate = (s) -> s.getGradeLevel()>3;



    static Function<List<Student>, Map<String, Integer>> function = (s -> {
        Map<String, Integer> map = new HashMap<>();
        s.forEach((i) -> {
            if(predicate.test(i)){
                map.put(i.getName(), i.getGradeLevel());
            }
        }
        );
        return map;
    });

    public static void main(String[] args) {
        List<Student> list = StudentDataBase.getAllStudents();
        System.out.println(function.apply(list));
    }
}
