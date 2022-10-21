package main.week5.day22_1021;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week5.day22_1021.SolveBracket;


class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 닫혀있는지")
    public void test() throws Exception {
        //given
        SolveBracket solveBracket = new SolveBracket();
        String s = "()()()()()()()()()()()()()";
        String s1 = ")()()()()()()()()()()()()";
        String s2 = "())()()()()()()()()()()()()";

        //when
        boolean result = solveBracket.solution3(s);
        boolean result1 = solveBracket.solution3(s1);
        boolean result2 = solveBracket.solution3(s2);
        //then
        Assertions.assertThat(result).isEqualTo(true);
        Assertions.assertThat(result1).isEqualTo(false);
        Assertions.assertThat(result2).isEqualTo(false);
    }
}