package features.java8.optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample2 {

    public static void orElse(){
        Optional<Student> optional = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));
        System.out.println(optional.map(Student::getName).orElse("NONE"));
    }

    public static void orElseGet(){
        Optional<Student> optional = Optional.empty();
        System.out.println(optional.map(Student::getName).orElseGet(() -> "NONE"));
    }

    public static void orElseThrow(){
        Optional<Student> optional = Optional.empty();
        System.out.println(optional.map(Student::getName).orElseThrow(() -> new RuntimeException("hii")));
    }

    public static void main(String[] args) {
        orElse();
        orElseGet();
        orElseThrow();
    }
}
