package week3.day3_1006.file_example;

import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int addnum = sc.nextInt();

        //원하는 글자만큼 파일에서 읽기
        ReadFileOne readFileOne = new ReadFileOne("./aa_file.txt",addnum);
        char c = (char) readFileOne.readOneByte();
        System.out.println(c);

//        //파일에서 라인별로 읽기
//        ReadFileByLine readFileByLine = new ReadFileByLine("./bb_file.txt");



    }

}

