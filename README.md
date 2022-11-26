<br></br>
<details><summary> 2021년 인구 이동 현황 분석 프로젝트_221007 </summary>

### 데이터 출처

---
![image](https://user-images.githubusercontent.com/110657129/194503656-71e2d4b9-496d-4d18-95e2-4ef78d015a93.png)
- [MDIS](https://mdis.kostat.go.kr/index.do) 공공 데이터
- 데이터 총 6209323개
---
### 행정구역 코드
<p><img src="https://user-images.githubusercontent.com/110657129/194503822-5316712b-af99-4cdd-a4fd-ca505791fecb.png" width="150" height="300">

---

### PopulationStatistics

---
- 메서드 설명
  <br></br>
  - parse() : 전입, 전출코드 한 줄 단위로 파싱
  <br></br>
  - readByFile() : 파일 단위로 파싱
  <br></br>
  - createAFile() : 파일 생성
  <br></br>
  - write() : 파일에 저장
  <br></br>
  - fromToString() : PopulationMove -> String 타입 변환
  <br></br>
  - getMoveCntMap() : 히트맵 생성
  <br></br>
- "from_to.txt" : 전입, 전출 코드 저장 파일
  <br></br>
- "sido_cnt.txt" : 전입, 전출과 그 횟수 저장 파일
  <br></br>
- "for_heatmap.txt" : 히트맵 그리기 위한 파일

```java
public class PopulationStatistics {

    // 전입, 전출코드 parsing - 한 줄 단위
    public PopulationMove parse(String data) {

        String[] cityArr = data.split(",");
        int fromCity = Integer.parseInt(cityArr[6]); //전출
        int toCity = Integer.parseInt(cityArr[0]);   //전입

        return new PopulationMove(fromCity, toCity);
    }

    // 전입, 전출코드 parsing - 파일 단위
    public List<PopulationMove> readByFile(String filename) throws IOException {

        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        List<PopulationMove> pml = new ArrayList<>();

        String str = "";
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    // 파일 생성
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 파일에 저장
    public void write(List<String> strs, String filename) {

        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();  // close()를 해야 저장된다.
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    // PopulationMove 타입 -> String 타입 변환
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
            moveCntMap.put(key,moveCntMap.getOrDefault(key,0)+1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\82104\\Desktop\\교안\\3주차(221007) 2021년 인구 이동 현황\\2021_인구관련연간자료_20221006_35421.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByFile(address);
        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);

        populationStatistics.createAFile("from_to.txt");

        /**
         * 전입, 전출 코드를 from_to.txt에서 저장하기
         */
        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(),pm.getToSido());
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }
        populationStatistics.write(strings,"./from_to.txt");

        /**
         * (전출,전입) 과 count 수를 sido_cnt.txt에 저장
         */
        String sidoFileName = "sido_cnt.txt";
        List<String> cntResult = new ArrayList<>();
        for(String key : map.keySet()) {
            String s = String.format("[전출->전입] : [%s], 횟수 : %d\n",key,map.get(key));
            cntResult.add(s);
        }
        populationStatistics.write(cntResult,sidoFileName);
        
        /**
         * heatmap 그리기 위한 txt파일 저장
         */
        String heatMapFileName = "for_heatmap.txt";
        List<String> result = new ArrayList<>();
        for(String key : map.keySet()) {
            String[] fromto = key.split(",");
            String s = String.format("[%s, %s, %d],\n", fromto[0],fromto[1], map.get(key));
            result.add(s);
        }
        populationStatistics.write(result,heatMapFileName);
    }
}
```

### PopulationMove

---
- 인구 이동을 위한 entity이다.
```java
public class PopulationMove {
    
    private int fromSido; //전출
    private int toSido; //전입

    // 생성자 추가
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    // getter 추가
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }
}
```

### heatmap 

---
![image](https://user-images.githubusercontent.com/110657129/194545524-a1ab14ea-5802-42b2-baab-9cdc25094bd3.png)





</details>

## [11월]
#### 22.11.25
- [CodeUp] [최대공약수 구하기](https://codeup.kr/problem.php?id=2623)
  - array로 구현
  - while로 구현
  - 재귀로 구현
- 꼬리 재귀
#### 22.11.24
- 재귀로 피보나치 수열
- [CodeUp] [별 삼각형 출력하기](https://codeup.kr/problem.php?id=1859)
- [CodeUp] [수 삼각형 출력하기](https://codeup.kr/problem.php?id=1860)
#### 22.11.23
- [CodeUp] [재귀로 * n개 한 줄로 출력하기](https://codeup.kr/problem.php?id=1851)
- [CodeUp] [재귀로 1부터 n까지 한 줄로 출력하기](https://codeup.kr/problem.php?id=1852)
- [CodeUp] [재귀로 1부터 n까지 합 리턴하기](https://codeup.kr/problem.php?id=1853)
- [CodeUp] [재귀로 각 자리 수의 합 리턴하기](https://codeup.kr/problem.php?id=1854)
- [CodeUp] [재귀로 n번째 피보나치 수 리턴하기](https://codeup.kr/problem.php?id=1855)
- [CodeUp] [계단 뛰어 오르기](https://codeup.kr/problem.php?id=1856)
- [CodeUp] [팩토리얼 계산](https://codeup.kr/problem.php?id=1912)
#### 22.11.22
- [CodeUp] [1~n까지 합 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
- List로 재귀 합
- Array로 재귀 합
- [CodeUp] [자릿수 합 구하기](https://codeup.kr/problem.php?id=1854&rid=0)
#### 22.11.17
#### 22.11.18
- [프로그래머스] [시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
- [프로그래머스] [행렬의 덧셈](https://school.programmers.co.kr/learn/courses/30/lessons/12950)
#### 22.11.17
- 퀵정렬 ver3
#### 22.11.16
- 퀵정렬 ver1, ver2
#### 22.11.15
- list를 이용한 퀵정렬 구현
#### 22.11.14
- 에라토스테네스의 체
#### 22.11.11
- [프로그래머스] [비밀지도](https://school.programmers.co.kr/learn/courses/30/lessons/17681)
  - 단순 구현
  - ver2 - 다른 풀이
  - ver3 - 비트 연산으로 구현
#### 22.11.10
- [프로그래머스] [같은 숫자는 싫어](https://school.programmers.co.kr/learn/courses/30/lessons/12906)
    - stack 사용, 안 사용하는 방법(미완)
- [프로그래머스] [기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586)(미완)
#### 22.11.09
- 선택정렬(Bifunction)
- 선택정렬(템플릿 콜백)
- 선택정렬(그냥 구현)
#### 22.11.08
- [코드업] 데이터 탐색 https://codeup.kr/problem.php?id=3001
- 이진 탐색 구현
#### 22.11.07
- [프로그래머스] [하샤드 수](https://school.programmers.co.kr/learn/courses/30/lessons/12947)
- [프로그래머스] [나누어 떨어지는 숫자 배열](https://school.programmers.co.kr/learn/courses/30/lessons/12910)
    - 배열로 구현
    - 우선순위 큐로 구현
#### 22.11.02 ~ 11.03
- 에라토스테네스의 체
#### 22.11.01
  - [프로그래머스] [소수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/12921)
    - 단순 구현
    - 에라토스테네스의 체로 구현
    - 템플릿 콜백

## [10월]
#### 22.10.31
- [프로그래머스] [모의고사](https://school.programmers.co.kr/learn/courses/30/lessons/42840)
#### 22.10.28
- [프로그래머스] [전화번호 목록](https://school.programmers.co.kr/learn/courses/30/lessons/42577)
- [프로그래머스] [폰켓몬](https://school.programmers.co.kr/learn/courses/30/lessons/1845)
#### 22.10.27
- [프로그래머스] [완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576)
#### 22.10.26
- 해시 충돌 해결
#### 22.10.25
- 해시 테이블, 해시 함수 구현
#### 22.10.24
- [프로그래머스] [K번째 수](https://school.programmers.co.kr/learn/courses/30/lessons/42748)
#### 22.10.21
- [프로그래머스] [올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909)
  - 괄호 풀기, 스택 활용
#### 22.10.20
- Stack isEmpty(), peek() 구현 및 테스트 코드 작성
- pop() 예외처리
#### 22.10.19
- Stack push(), pop() 구현 및 테스트 코드 작성
#### 22.10.18
- 정/직사각형으로 별 찍기
#### 22.10.17
- 피라미드 별 찍기
#### 22.10.14
- 삽입정렬
#### 22.10.13
- 버블정렬(오름차순)
- #### 22.10.12
- 여러 개의 자연수 중 최댓값 찾기
  - 인터페이스 이용한 방법
#### 22.10.11
- [프로그래머스] [자릿수 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/12931)
#### 22.10.06
- [코드업] 1021 ~ 1030
- 랜덤한 숫자 중복 제거
- 랜덤한 알파벳 중복 제거
#### 22.10.05
- [코드업] 1011 ~ 1020
- List에 90명 이름 넣고 출력
#### 22.10.04
- 짝수,홀수 출력
- 거스름돈 






