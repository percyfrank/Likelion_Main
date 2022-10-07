//package week3.day3_1006.file_example;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class ReadFileByLine {
//    private String filename;
//
//    public ReadFileByLine(String filename) {
//        this.filename = filename;
//    }
//
//    String readLine() throws IOException {
//        BufferedReader br = new BufferedReader(
//                new FileReader(this.filename),
//                16 * 1024
//        );
//
//        String line = "";
//        while ((line == br.readLine()) != null) {
//            System.out.println(line);
//        }
//
//        return (char)br.read();
//    }
//}
