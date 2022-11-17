package findTheOddInt;

import java.util.HashMap;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(FindOdd.findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
        System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println(FindOdd.findIt(new int[]{10}));
    }

    public class FindOdd {
        public static int findIt(int[] A) {
            for (int i : A) {
                int temp = 0;
                for (int j : A)
                    if (j == i)
                        temp++;
                if (temp % 2 == 1)
                    return i;
            }
            return 0;
        }
    }
}
