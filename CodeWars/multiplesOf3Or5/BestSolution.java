package multiplesOf3Or5;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(MultiplesOf3Or5.Solution.solution(10));
    }

    public static class Solution {

        public static int solution(int number) {
            int total = 0;
            for (int i = 0; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0)
                    total += i;
            }
            return total;
        }
    }
}
