package week3.day2_1005.example;

import java.util.ArrayList;
import java.util.List;

public class LionList {

    List<Student> studentObjList = new ArrayList<>();
    List<String> studentNameList = new ArrayList<>();

    public LionList() {
        Names names = new Names();
        this.studentObjList = names.getStudentObj();
        this.studentNameList = names.getStudentName();
    }

    public List<Student> getStudentObjList() {
        return studentObjList;
    }

    public List<String> getStudentNameList() {
        return studentNameList;
    }
}
