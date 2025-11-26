package features.java8.streamsapi.terminaloperation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class PartitioningByExample {

    public static Map<Boolean, List<Student>> partitionBy_1() {

    Predicate<Student> p = (s) -> s.getGpa() > 3.5;

    return StudentDataBase.getAllStudents().stream().collect(partitioningBy(p));
}

    public static Map<Boolean, Set<Student>> partitionBy_2() {

        Predicate<Student> p = (s) -> s.getGpa() > 3.5;

        return StudentDataBase.getAllStudents().stream().collect(partitioningBy(p, toSet()));
    }

    public static void main(String[] args) {
        System.out.println(partitionBy_1());
        System.out.println(partitionBy_2());
    }
}
