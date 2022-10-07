package week3.day4_1007.population_exercise;

import java.util.HashMap;

public class PopulationMove {

    private int fromSido; // 전출 코드
    private int toSido;   // 전입 코드


    public PopulationMove( int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }


    public int getToSido() {
        return toSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }
}
