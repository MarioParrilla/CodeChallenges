package tribonacciSequence;

import java.util.Arrays;

public class TribonacciSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double []{0,0,1}, 10)));
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double []{0,1,1}, 10)));
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double []{8, 3, 16}, 2)));
    }

    public static class Xbonacci {

        public static double[] tribonacci(double[] s, int n) {
            if (n == 0)
                return new double[0];

            double[] result = new double[n];
            for (int i = 0; i < n; i++) {
                if(i < 3) {
                    result[i] = s[i];
                }
                else
                    result[i] = (result[i-3])+(result[i-2])+(result[i-1]);
            }
            return result;
        }
    }
}
