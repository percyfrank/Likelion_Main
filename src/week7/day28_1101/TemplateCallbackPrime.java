package week7.day28_1101;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {

    boolean isPrime(int num,StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i,num) ; i++) {
            System.out.println(i);
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r = tcp.isPrime(13, (a, b) -> a < b);
        boolean r1 = tcp.isPrime(13, (a, b) -> a * a < b);
        boolean r2 = tcp.isPrime(13, (a, b) -> a < b / 2);
        boolean r3 = tcp.isPrime(13, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a < b;
            }
        });
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
