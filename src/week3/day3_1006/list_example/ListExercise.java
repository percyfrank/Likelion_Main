package week3.day3_1006.list_example;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("권오석");
    }

    public List<String> getStudents() {
        return students;
    }
}
