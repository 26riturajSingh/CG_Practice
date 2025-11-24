package features.java8.streamsapi;

import data.Student;
import data.StudentDataBase;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static Set<String> toSet(){
        Set<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet());

        return list;
    }

    public static void main(String[] args) {
        System.out.println(toSet());
    }
}
