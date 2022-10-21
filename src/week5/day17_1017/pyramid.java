package week5.day17_1017;

import java.util.Scanner;

public class pyramid {

    private String letter = "*";

    public pyramid() {
    }

    public pyramid(String letter) {
        this.letter = letter;
    }

    public void printSomething(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf(this.letter);
            }
            System.out.println();
        }
    }

    public void printPyramid(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        pyramid pyramid = new pyramid();
//        pyramid.printSomething(N);
        pyramid.printPyramid(N);
    }

}
