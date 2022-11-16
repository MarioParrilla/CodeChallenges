public class numOfSteps {
    public static void main(String[] args) {
        Solution.numberOfSteps(4);
    }

    static class Solution {
        public static int numberOfSteps(int num) {
            int counter = 0;

            while (num > 0) {
                if (num % 2 == 0)
                    num = num / 2;
                else
                    num -= 1;
                counter++;
            }

            return counter;
        }
    }
}
