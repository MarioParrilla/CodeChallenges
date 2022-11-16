package squareEveryDigit;

import java.util.stream.Collectors;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(SquareDigit.squareDigits(9119));
    }

    public static class SquareDigit {
        public static int squareDigits(int n) {
            return Integer.parseInt(String.valueOf(n)
                    .chars()
                    .map(i -> Integer.parseInt(String.valueOf((char) i)))
                    .map(i -> i * i)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
        }

    }
}
