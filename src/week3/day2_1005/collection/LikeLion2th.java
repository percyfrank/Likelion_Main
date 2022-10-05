package week3.day2_1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {

    private List<String> students = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        this.students = names.names();
    }

    // 학생의 이름이 들어있는 list를 반환하는 메서드
    public List<String> getStudentList() {
        return this.students;
    }
}
