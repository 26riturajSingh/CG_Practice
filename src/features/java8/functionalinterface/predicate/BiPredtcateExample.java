package features.java8.functionalinterface.predicate;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredtcateExample {

    BiPredicate<Student, Student> biPredicate = (a,b) -> a.getGradeLevel()>3 && a.getGpa()>2;

    BiConsumer<String, List<String>> biConsumer = (a, b) -> System.out.println(a + " : " + b);

    Consumer<Student> consumer = (s) ->{
        if(biPredicate.test(s,s)){
            biConsumer.accept(s.getName(), s.getActivities());
        }
    };

    public void filter(List<Student> list){
        list.forEach(consumer);
    }

    public static void main(String[] args) {
        List<Student> list = StudentDataBase.getAllStudents();
        new ConsumerPredicateExample().filter(list);
    }
}
