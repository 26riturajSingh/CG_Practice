package features.java8.streamsapi.terminaloperation;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream()
                            .collect(Collectors.mapping(Student::getName, Collectors.toList()))
        );
    }
}
