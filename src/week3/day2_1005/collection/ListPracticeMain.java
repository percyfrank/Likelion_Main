package week3.day2_1005.collection;

import java.util.Iterator;
import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();

        Iterator<String> it = students.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        for(String student : students) {
//            System.out.println(student);
//        }

    }
}
