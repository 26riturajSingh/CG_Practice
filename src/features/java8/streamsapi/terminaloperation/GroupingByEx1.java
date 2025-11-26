package features.java8.streamsapi.terminaloperation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingByEx1 {

    public static Map<String, List<Student>> grouping(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> grouping1(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(s -> s.getGpa()>3.1 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static void main(String[] args) {
//        System.out.println(grouping());
        System.out.println(grouping1());
    }
}
