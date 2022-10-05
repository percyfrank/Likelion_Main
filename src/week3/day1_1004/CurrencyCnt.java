package week3.day1_1004;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CurrencyCnt {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money;
        int cnt = 0;

        ArrayList<Integer> cntList = new ArrayList<Integer>(8);
        int[] moneyTypes = {50000,10000,5000,1000,500,100,50,10};

        System.out.print("금액을 넣으세요:");
        money = Integer.parseInt(br.readLine());
        for (int i = 0; i < moneyTypes.length; i++) {
            cnt = money / moneyTypes[i];
            cntList.add(cnt);
            money %= moneyTypes[i];
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(moneyTypes[i]+"원"+cntList.get(i)+"개");
        }
    }
}
