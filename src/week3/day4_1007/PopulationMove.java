package week3.day4_1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;


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

}
