package features.java8.constructorreference;

import data.Student;

import java.util.function.Function;

public class ConstructorReferenceExample {

    static Function<String, Student> f = Student::new;

    public static void main(String[] args) {
        System.out.println(f.apply("Hi"));
    }
}
