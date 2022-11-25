package week10.day44_1125;

public class TailRecursion {
    public static void recur(int n) {
        if(n <= 0) return;
        recur(n - 1);
        System.out.println(n);
        recur(n-2);
    }

    public static void recurWithNotrecur(int n) {
        while (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n -= 2;
        }
    }


    public static void main(String[] args) {
        recur(3);
        System.out.println();
        recurWithNotrecur(3);
    }

}
