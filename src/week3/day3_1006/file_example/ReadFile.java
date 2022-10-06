package week3.day3_1006.file_example;

import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int addnum = sc.nextInt();

        ReadFileOne readFileOne = new ReadFileOne("./aa_file.txt",addnum);
        char c = (char) readFileOne.readOneByte();
        System.out.println(c);

    }

}

