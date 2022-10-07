package week3.day4_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);
        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);

    }

    //    public void readByLine(String filename) throws IOException {
//        BufferedReader reader = new BufferedReader(
//                new FileReader(filename)
//        );
//
//        String str ="";
//        while((str = reader.readLine()) != null) {
//            System.out.println(str);
//        }
//
//    }

    public void readByLine2(String filename) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
//                PopulationMove p = parse(line);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<PopulationMove> readByLine(String filename) throws IOException {

        ArrayList<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String str = "";
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }


    public PopulationMove parse(String data) {

        String[] cityArr = data.split(",");
        int fromCity = Integer.parseInt(cityArr[6]);
        int toCity = Integer.parseInt(cityArr[0]);

        return new PopulationMove(fromCity, toCity);
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : strs) {
            writer.write(str);
        }
        writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }
    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\82104\\Desktop\\2021_인구관련연간자료_20221006_35421.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml) {
//            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(),pm.getToSido());
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }

        populationStatistics.write(strings,"./from_to.txt");

    }

}
