package week3.day3_1006.file_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileExercise {

    private String filename;

    public FileExercise(String filename) {
        this.filename = filename;
    }

    public void printFiles() {
        // 디렉토리 지정
        File dir = new File("./");
//        File dir = new File("C:\\");
        File files[] = dir.listFiles();
        for(File file : files)
            System.out.println(file);
    }

    public char readAChar(String filename) throws IOException {
        // root directory ./
        FileReader fileReader = new FileReader("./aa_file.txt");
        return (char)fileReader.read();

    }
    public String readTwoChar(String filename) throws IOException {
        // root directory ./
        FileReader fileReader = new FileReader("./aa_file.txt");
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }
    public String readNChar(int N) throws IOException {
        // root directory ./
        FileReader fileReader = new FileReader("./aa_file.txt");
        String str = "";
        for (int i = 0; i < N; i++) {
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }
//    public String readByLine(String filename) throws IOException {
//        FileReader fileReader = new FileReader("./aa_file.txt");
//        String str = "";
//        str += (char)fileReader.read();
//        str += (char)fileReader.read();
//        return str;
//    }

    public static void main(String[] args) throws IOException {

        FileExercise fileExercise = new FileExercise("aa_file.txt");
        // 글자 1개 출력
        char onechar = fileExercise.readAChar("aa_file.txt");
        System.out.println(onechar);

        //글자 2개 출력
        String twochar = fileExercise.readTwoChar("aa_file.txt");
        System.out.println(twochar);

        //글자 N개 출력
        Scanner sc = new Scanner(System.in);
        String nchar = fileExercise.readNChar(sc.nextInt());
        System.out.println(nchar);

//        //라인 1줄 출력
//        String oneline = fileExercise.readByLine();
//        System.out.println();
//
//        //라인 N줄 출력
//        String nline = fileExercise.readByLine();
//        System.out.println();


    }
}
