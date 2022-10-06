package week3.day3_1006.file_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {

        // root directory ./
        FileReader fileReader = new FileReader("./aa_file.txt");

        // 디렉토리 지정
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files)
            System.out.println(file);

    }
}
