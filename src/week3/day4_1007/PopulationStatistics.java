package week3.day4_1007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);
        String fileContents ="";
        while(fileContents.length() < 1_000_000) {
            char c = (char)fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);

    }

    public void readByLine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String str ="";
        while((str = reader.readLine()) != null) {
            System.out.println(str);
        }

    }

    public void readByLine2(String filename) throws IOException {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {

        String[] cityArr = data.split(",");
        int inCity = Integer.parseInt(cityArr[0]);
        int toCity = Integer.parseInt(cityArr[6]);

        return new PopulationMove(inCity,toCity);
    }


    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\82104\\Desktop\\2021_인구관련연간자료_20221006_35421.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
//        populationStatistics.readByChar(address);
        populationStatistics.readByLine(address);

    }
}
