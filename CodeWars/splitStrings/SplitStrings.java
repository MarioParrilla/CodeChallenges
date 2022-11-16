package splitStrings;

import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(StringSplit.solution("abcdef")));
        System.out.println(Arrays.toString(StringSplit.solution("abcde")));
    }

    public static class StringSplit {
        public static String[] solution(String s) {
            int length = s.length();
            int lastPos = 0;
            String[] result = new String[(int) Math.ceil(length/2.0)];

            for (int i = 0; i < result.length; i++) {
                if (length % 2 != 0 && i == result.length-1)
                    result[i] = s.substring(lastPos) + "_";
                else {
                    result[i] = s.substring(lastPos, lastPos+2);
                    lastPos += 2;
                }
            }
            return result;
        }
    }
}
