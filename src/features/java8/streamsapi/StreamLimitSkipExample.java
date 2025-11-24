package features.java8.streamsapi;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamLimitSkipExample {

    public static List<Student> list(){
        return StudentDataBase.getAllStudents().stream()
                .limit(4)
                .filter(s -> s.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    public static Optional<Integer> skipEx(){
        return StudentDataBase.getAllStudents().stream()
                .skip(4)
                .filter(s -> s.getGpa()>3.5)
                .map(Student::getNotebooks)
                .reduce((a,b) -> a+b);
    }

    public static void main(String[] args) {
        System.out.println(list());
        System.out.println(skipEx().get());
    }
}