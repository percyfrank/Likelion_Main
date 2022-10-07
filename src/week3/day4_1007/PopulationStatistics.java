package week3.day4_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void readByLineOriginal(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
            new FileReader(filename)
        );

        String str ="";
        while((str = reader.readLine()) != null) {
            System.out.println(str);
        }
    }
    public void readByLineFast(String filename) throws IOException {
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
    public PopulationMove parse(String data) {

        String[] cityArr = data.split(",");
        int fromCity = Integer.parseInt(cityArr[6]); //전출
        int toCity = Integer.parseInt(cityArr[0]);   //전입

        return new PopulationMove(fromCity, toCity);
    }
    public List<PopulationMove> readByLine(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
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
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 파일에 저장하는 메서드
    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : strs) {
            writer.write(str);
        }
        writer.close();  //close()를 해야 저장된다.
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {

        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            // key가 없다면 생성하면서 1로 초기화
            if(moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            // key가 있다면 갯수 + 1
            moveCntMap.put(key,moveCntMap.get(key)+1);
        }
        return moveCntMap;
    }


    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\82104\\Desktop\\2021_인구관련연간자료_20221006_35421.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);
        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);

        populationStatistics.createAFile("from_to.txt");

//        //전입, 전출 코드를 from_to.txt에서 저장하기
//        List<String> strings = new ArrayList<>();
//        for(PopulationMove pm : pml) {
//            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(),pm.getToSido());
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//        populationStatistics.write(strings,"./from_to.txt");
//
//        // (전입,전출) 과 count수를 each_sido_cnt.txt에 저장
//        String targetFilename = "each_sido_cnt.txt";
//        List<String> cntResult = new ArrayList<>();
//        for(String key : map.keySet()) {
//            String s = String.format("key:%s, value:%d\n",key,map.get(key));
//            cntResult.add(s);
//        }
//        populationStatistics.write(cntResult,targetFilename);
//
//
//        // heatmap 그리기 위한 txt파일 저장
//        String targetFilename = "for_heatmap.txt";
//        List<String> cntResult = new ArrayList<>();
//        for(String key : map.keySet()) {
//            String[] fromto = key.split(",");
//            String s = String.format("[%s, %s, %d],\n", fromto[0],fromto[1], map.get(key));
//            cntResult.add(s);
//        }
//        populationStatistics.write(cntResult,targetFilename);


    }
}
