package features.java8.defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ComparingExample1 {

    static Consumer<Student> c1 = s -> System.out.println(s);
    static Comparator<Student> nameCompa = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaCom = Comparator.comparingDouble(Student::getGpa);

    public static List<Student> nameOrder(){
        List<Student> list = StudentDataBase.getAllStudents();
        list.sort(nameCompa);
        return list;
    }

    public static List<Student> nameGpaOrder(){
        List<Student> list = StudentDataBase.getAllStudents();
        list.sort(gpaCom.thenComparing(nameCompa));
        return list;
    }

    public static void main(String[] args) {
//        nameOrder().forEach(c1);
            nameGpaOrder().forEach(c1);
    }
}
