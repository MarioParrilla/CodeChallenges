import java.util.Arrays;

public class mergeSortedArray {
    class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int j = 0;
            for (int i = m; i < n + m; i++) {
                nums1[i] = nums2[j++];
            }
            Arrays.sort(nums1);
        }
    }

    public static void main(String[] args) {
        int[] x = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] y = new int[] { 2, 5, 6 };

        Solution.merge(x, 3, y, 3);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
    }
}
