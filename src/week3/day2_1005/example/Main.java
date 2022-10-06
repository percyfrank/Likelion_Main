package week3.day2_1005.example;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LionList lionList = new LionList();
//        List<Student> studentObj = lionList.getStudentObjList();
        List<String> studentName = lionList.getStudentNameList();

//        Iterator<Student> it = studentObj.iterator();
        Iterator<String> it1 = studentName.iterator();


        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

    }
}
