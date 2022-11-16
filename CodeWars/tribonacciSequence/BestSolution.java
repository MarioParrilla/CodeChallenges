package tribonacciSequence;

import java.util.Arrays;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double []{0,0,1}, 10)));
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double []{0,1,1}, 10)));
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double []{8, 3, 16}, 2)));
    }

    public static class Xbonacci {

        public static double[] tribonacci(double[] s, int n) {
            double[] result = Arrays.copyOf(s, n);
            for(int i=3;i<n;i++) {
                result[i] = result[i-1]+result[i-2]+result[i-3];
            }
            return result;
        }
    }
}
