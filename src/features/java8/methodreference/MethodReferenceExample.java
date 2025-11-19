package features.java8.methodreference;

import data.Student;
import data.StudentDataBase;
import features.java8.functionalinterface.function.FunctionExample;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceExample {

    static Function<String, String> function = String::toUpperCase;

    static Consumer<Student> consumer = System.out::println;

    static Consumer<Student> c2 = Student::getActivities;

    public static void main(String[] args) {
        System.out.println(function.apply("hello"));

        StudentDataBase.getAllStudents().forEach(consumer);

        StudentDataBase.getAllStudents().forEach(c2);
}}
