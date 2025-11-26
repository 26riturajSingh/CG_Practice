package features.java8.streamsapi.terminaloperation;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MinMaxBy {

    public static Optional<Student> minByM(){
        return StudentDataBase.getAllStudents().stream()
                                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByM(){
        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(minByM());
        System.out.println(maxByM());
    }
}
