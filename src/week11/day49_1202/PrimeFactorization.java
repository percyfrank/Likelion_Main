package week11.day49_1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 코드업 - 4037번 소인수분해
 */
public class PrimeFactorization {

    public static void printWithWhile(int n) {
        int primeNum = 2;
        while(n != 1) {
            if(n % primeNum == 0) {
                System.out.print(primeNum + " ");
                n /= primeNum;
            } else {
                primeNum++;
            }
        }
    }

    public static void printRecursive(int n) {

        for (int primeNum = 2; primeNum <= n; primeNum++) {
            if(n % primeNum == 0) {
                System.out.print(primeNum + " ");
                printRecursive(n / primeNum);
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        printWithWhile(n);
        System.out.println();
        printRecursive(n);

    }
}
