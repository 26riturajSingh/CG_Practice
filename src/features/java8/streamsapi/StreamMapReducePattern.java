package features.java8.streamsapi;

import data.Student;
import data.StudentDataBase;

public class StreamMapReducePattern {

    public static Integer getStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa()>2.5)
                .filter(s -> s.getGender().equals("male"))
                .map(Student::getNotebooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(getStudents());
    }
}
