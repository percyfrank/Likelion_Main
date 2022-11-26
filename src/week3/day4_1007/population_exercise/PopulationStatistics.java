package week3.day4_1007.population_exercise;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    // 한 글자씩 읽어오는 메서드
    public void readByChar(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);
        String fileContents = "";
        while(fileContents.length() <= 1_000_000) {
            char c = (char)fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    // 한 줄씩 읽어오는 메서드
    public void readByLine(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);

        String str = "";
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
    }

    // 한 줄씩 읽어오는 메서드 ver.2
    public void readByLineImproved(String filename) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 전입, 전출코드 parsing - 한 줄 단위
    public PopulationMove parse(String data) {

        String[] strs = data.split(",");
        int fromSido = Integer.parseInt(strs[6]);
        int toSido = Integer.parseInt(strs[0]);

        return new PopulationMove(fromSido,toSido);
    }

    // 전입, 전출코드 parsing - 파일 단위
    public List<PopulationMove> readByFile(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);

        // parse메서드 이용하여 parsing한 데이터를 리스트에 삽입
        List<PopulationMove> pml = new ArrayList<>();

        String str = "";
        while ((str = reader.readLine()) != null) {
            PopulationMove parse = parse(str);
            pml.add(parse);
        }
        reader.close();
        return pml;

    }

    // 파일 생성하기
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 파일에 저장하기
    public void write(List<String> datas, String filename) {

        File file = new File(filename);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(String data : datas) {
                bw.write(data);
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // PopulationMove 타입 -> String 타입 변환
    public String dataToString(PopulationMove pm) {
        return pm.getFromSido() +  "," + pm.getToSido() + "\n";
    }

    public Map<String,Integer> getDataToMap(List<PopulationMove> pml) {

        // String (전출,전입), 그 횟수가 Integer (value)에 저장된 map
        Map<String, Integer> map = new HashMap<>();
        for(PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(map.get(key) == null) {
                map.put(key,1);
            } else {
                map.put(key,map.getOrDefault(key,0)+1);
            }
        }
        return map;
    }

    public Map<String,Integer> SidoCode() {
        Map<String,Integer> map = new HashMap<>();
        map.put("11",0);
        map.put("26",1);
        map.put("27",2);
        map.put("28",3);
        map.put("29",4);
        map.put("30",5);
        map.put("31",6);
        map.put("36",7);
        map.put("41",8);
        map.put("42",9);
        map.put("43",10);
        map.put("44",11);
        map.put("45",12);
        map.put("46",13);
        map.put("47",14);
        map.put("48",15);
        map.put("50",16);
        return map;
    }

    public static void main(String[] args) throws IOException {
        /**
         * 전입, 전출 코드를 from_to_exercise.txt에 저장하기
         */
        String address = "C:\\Users\\82104\\Desktop\\교안\\3주차(221007) 2021년 인구 이동 현황\\2021_인구관련연간자료_20221006_35421.csv";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByFile(address);

        ps.createAFile("from_to_exercise.txt");

        // parsing한 데이터를 담기 위한 리스트
        ArrayList<String> strings = new ArrayList<>();

        for(PopulationMove pm : pml) {
            System.out.printf("전출 : %s, 전입 : %s\n",pm.getFromSido(),pm.getToSido());
            strings.add(ps.dataToString(pm));
        }

        ps.write(strings,"./from_to_exercise.txt");

        /**
         * 전출 -> 전입 횟수 세기
         */
        String address1 = "C:\\Users\\82104\\Desktop\\교안\\3주차(221007) 2021년 인구 이동 현황\\2021_인구관련연간자료_20221006_35421.csv";
        PopulationStatistics ps1 = new PopulationStatistics();

        // 전입, 전출 코드만 parsing된 데이터
        List<PopulationMove> pmll = ps1.readByFile(address);

        // key가 (전입,전출) 이고 그 횟수가 value에 저장된 map
        Map<String,Integer> map = ps1.getDataToMap(pmll);

        ps1.createAFile("./sido_cnt_exercise");
        String targetFile = "sido_cnt_exercise";

        ArrayList<String> cntResult = new ArrayList<>();
        for(String key : map.keySet()) {
            String s = String.format("[전출->전입] : [%s], 횟수 : %d\n",key,map.get(key));
            cntResult.add(s);
        }
        ps1.write(cntResult, targetFile);

        /**
         * heatmap 그리기 위한 메서드
         */
        String address2 = "C:\\Users\\82104\\Desktop\\교안\\3주차(221007) 2021년 인구 이동 현황\\2021_인구관련연간자료_20221006_35421.csv";
        PopulationStatistics ps2 = new PopulationStatistics();

        List<PopulationMove> pmlll = ps.readByFile(address2);

        Map<String, Integer> heatMap = ps.getDataToMap(pmlll);

        ps.createAFile("./for_heatmap_exercise.txt");
        String heatMapFile = "for_heatmap_exercise.txt";

        List<String> strings1 = new ArrayList<>();
        Map<String,Integer> sidoForHeatMap = ps.SidoCode();
        for(String key : heatMap.keySet()) {
            String[] fromto = key.split(",");
            String format = String.format("[전출, 전입, 횟수] : [%s, %s, %d]\n", sidoForHeatMap.get(fromto[0]),
                    sidoForHeatMap.get(fromto[1]), heatMap.get(key));
            strings1.add(format);
        }
        ps.write(strings,heatMapFile);


    }

}
