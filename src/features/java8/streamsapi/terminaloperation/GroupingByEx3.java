package features.java8.streamsapi.terminaloperation;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class GroupingByEx3 {

    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)
                        ))
        );
    }
}
