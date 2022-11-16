public class duplicateZeroArray {
    class Solution {
        public static void duplicateZeros(int[] arr) {
            boolean can = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0 && can) {
                    duplicateZero(arr, i);
                    can = false;
                } else
                    can = true;
            }
        }

        private static void duplicateZero(int[] arr, int zeroPos) {
            if (zeroPos + 1 >= arr.length)
                return;
            int prev = arr[zeroPos + 1], temp = 0;
            arr[zeroPos + 1] = temp;

            for (int i = zeroPos + 2; i < arr.length; i++) {
                temp = prev;
                prev = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] x = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        Solution.duplicateZeros(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i]);
        }
    }
}
