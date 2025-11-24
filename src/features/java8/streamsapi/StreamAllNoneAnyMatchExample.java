package features.java8.streamsapi;

import data.StudentDataBase;

public class StreamAllNoneAnyMatchExample {

    public static boolean allmethd(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(s -> s.getGradeLevel()>1);
    }

    public static boolean anymethd(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(s -> s.getGradeLevel()>5);
    }

    public static boolean nonemethd(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(s -> s.getGradeLevel()>5);
    }

    public static void main(String[] args) {
        System.out.println(allmethd());
        System.out.println(anymethd());
        System.out.println(nonemethd());
    }
}
