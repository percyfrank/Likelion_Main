package week5.day18_1018;

import java.util.Scanner;

public class SquareStar {

    public void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SquareStar squareStar = new SquareStar();
        squareStar.printSquare(sc.nextInt());
        squareStar.printRectangle(sc.nextInt(),sc.nextInt());
    }
}
