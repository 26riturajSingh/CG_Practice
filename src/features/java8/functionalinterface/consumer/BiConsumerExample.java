package features.java8.functionalinterface.consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    static BiConsumer<String, List<String>> biConsumer = (name, activity) -> {
        System.out.println(name + " => " + activity);
    };

    public static void getNameAndActivties(List<Student> list){
        list.forEach(s -> biConsumer.accept(s.getName(), s.getActivities()));
    }

    public static void main(String[] args) {
        List<Student> list = StudentDataBase.getAllStudents();
        getNameAndActivties(list);
    }
}
