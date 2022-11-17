package findTheOddInt;

import java.util.HashMap;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(FindOdd.findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
        System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println(FindOdd.findIt(new int[]{10}));
    }

    public class FindOdd {
        public static int findIt(int[] a) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : a) {
                int count = map.get(i) != null ? map.get(i)+1 : 1;
                map.put(i, count);
            }
            for (int i : map.keySet()) {
                if(map.get(i) % 2 != 0)
                    return i;
            }
            return 0;
        }
    }
}
