package week4.day2_1012;

interface Operation {
    int operation(int a, int b);
}

public class Gugudan {
    public void printGugudanTemplate(int dan, Character operator,Operation operation) {
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = d%\n",
                    dan, operator, i, operation.operation(dan,i));
        }
    }

    public void printPlusGugu(int dan) {
        printGugudanTemplate(dan, '*', new Operation() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        });
    }

    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        for (int j = 2; j <= 9; j++) {
            gugudan.printPlusGugu(j);
        }
    }
}
