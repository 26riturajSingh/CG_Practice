package features.java8.streamsapi;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamReduceExample {

    public static Optional<Student> getHighestGpa(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        System.out.println(getHighestGpa().get());
    }
}
