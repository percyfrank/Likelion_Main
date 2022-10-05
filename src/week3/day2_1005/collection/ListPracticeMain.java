package week3.day2_1005.collection;

import java.util.Iterator;
import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
//        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObj = likeLion2th.getStudentObj();

        Iterator<Student> it1 = studentObj.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next().toString());
        }

//        Iterator<String> it = students.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }



    }
}
