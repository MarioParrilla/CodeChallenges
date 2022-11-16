package splitStrings;

import java.util.Arrays;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(StringSplit.solution("abcdef")));
        System.out.println(Arrays.toString(StringSplit.solution("abcde")));
    }

    public static class StringSplit {
        public static String[] solution(String s) {
            s = (s.length() % 2 == 0)?s:s+"_";
            return s.split("(?<=\\G.{2})");
        }
    }
}
