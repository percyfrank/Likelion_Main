package week5.day18_1018;

import java.util.Scanner;

public class RecursiveStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RecursiveStar recursiveStar = new RecursiveStar();
        recursiveStar.printRecursive(sc.nextInt());
    }

    public void Recursive(int n) {
        if(n <= 0) return;
        Recursive(n-1);
        System.out.printf("*");
    }
    public void printRecursive(int n) {

        if(n <= 0) return;
        printRecursive(n-1);
        Recursive(n);
        System.out.println();
        return;
    }
}
