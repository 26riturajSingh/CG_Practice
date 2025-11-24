package features.java8.functionalinterface.predicate;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Student> p1 = (i) -> {
        return i.getGradeLevel()>=3;
    };

    static Predicate<Double> p2 = (i) -> {
        return i>3.9;
    };

    static Predicate<Student> p3 = (i) -> {
        return i.getGpa()>3.9;
    };

    public static void filterStudents1(List<Student> list){
        list.forEach((i) -> {
           if(p1.test(i)){
               System.out.println(i);
           }
        });
    }

    public static void filterStudents2(List<Student> list){
        list.forEach((i) -> {
            if(p1.test(i) && p2.test(i.getGpa())){
                System.out.println(i);
            }
        });
    }

    public static void filterStudents3(List<Student> list){
        list.forEach((i) -> {
            if(p1.and(p3).test(i)){
                System.out.println(i);
            }
        });
    }


    public static void main(String[] args) {
        List<Student> list = StudentDataBase.getAllStudents();
        System.out.println("F1");
        filterStudents1(list);
        System.out.println("F2");
        filterStudents2(list);
        System.out.println("F3");
        filterStudents3(list);
    }

}
