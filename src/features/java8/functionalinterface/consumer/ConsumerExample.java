package features.java8.functionalinterface.consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c1 = (student -> System.out.print(student.getName() + " "));
    static Consumer<Student> c2 = new Consumer<Student>() {
        @Override
        public void accept(Student student) {
            System.out.print(student.getGender() + " ");
        }
    };

    static Consumer<Student> c3 = (student) -> System.out.println(student.getGpa());

    public static void printAllResult(List<Student> list){
        list.forEach(c1.andThen(c2).andThen(c3));
    }

    public static void printFewResult(List<Student> list){
        list.forEach((st) -> {
            if(st.getGpa()>3.9){
                c1.andThen(c2).andThen(c3).accept(st);
            }
        });
    }

    public static void main(String[] args) {
        List<Student> list = StudentDataBase.getAllStudents();
        System.out.println("Print all results: ");
        printAllResult(list);
        System.out.println("Print few results: ");
        printFewResult(list);

    }
}
