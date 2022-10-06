package week3.day3_1006.list_example;

import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();

        for(String student : students) {
            System.out.println(student);
        }

        System.out.println(students.size());
        System.out.println();
    }
}
