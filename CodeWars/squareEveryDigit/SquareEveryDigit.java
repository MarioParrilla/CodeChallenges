package squareEveryDigit;

import disemvowelTrolls.DisemvowelTrolls;

public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(SquareDigit.squareDigits(9119));
    }

    public static class SquareDigit {

        public static int squareDigits(int n) {
            StringBuilder tmp = new StringBuilder();
            String[] nString = String.valueOf(n).split("");
            for (String s : nString) {
                int tmp2 = Integer.parseInt(s);
                tmp.append(String.valueOf(tmp2 * tmp2));
            }
            return Integer.parseInt(tmp.toString());
        }

    }
}
