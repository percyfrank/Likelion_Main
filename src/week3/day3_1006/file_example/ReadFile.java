package week3.day3_1006.file_example;

import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("./a_file.txt");

        char c = (char) fileReader.read();
        System.out.println(c);

    }

}

