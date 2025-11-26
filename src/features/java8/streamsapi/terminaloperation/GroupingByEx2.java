package features.java8.streamsapi.terminaloperation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class GroupingByEx2 {

    public static Map<Integer, Map<String, List<Student>>> grpBy1(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(s -> s.getGpa() > 3.5 ? "OUt" : "AVG")
                        ));
    }


    public static Map<String, Integer> grpBy2(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNotebooks)
                ));
    }

    public static void main(String[] args) {
//        System.out.println(grpBy1());
        System.out.println(grpBy2());
    }
}
