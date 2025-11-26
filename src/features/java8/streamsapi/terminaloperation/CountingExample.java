package features.java8.streamsapi.terminaloperation;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class CountingExample {

    public static Long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equals("female"))
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
