public class weaknessRows {
    public static void main(String[] args) {
        Solution.kWeakestRows(null, 3);
    }

    static class Solution {
        public static int[] kWeakestRows(int[][] mat, int k) {
            int[] soldierCounter = new int[mat.length];
            int[] flag = new int[mat.length];

            for (int i = 0; i < mat.length; i++) {
                int count = 0;
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == 1)
                        count++;
                }
                soldierCounter[i] = count;
                flag[i] = i;
            }

            int pos, currentNum, currentFlag = 0;

            for (int i = 0; i < soldierCounter.length; i++) {
                pos = i;
                currentNum = soldierCounter[i];
                currentFlag = flag[i];

                while ((pos > 0) && (soldierCounter[pos - 1] > currentNum)) {
                    soldierCounter[pos] = soldierCounter[pos - 1];
                    flag[pos] = flag[pos - 1];
                    pos--;
                }
                soldierCounter[pos] = currentNum;
                flag[pos] = currentFlag;
            }

            soldierCounter = new int[k];

            for (int i = 0; i < k; i++)
                soldierCounter[i] = flag[i];

            return soldierCounter;
        }
    }
}
