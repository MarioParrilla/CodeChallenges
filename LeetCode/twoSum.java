public class twoSum {
    public static void main(String[] args) {
        Solution.twoSum(null, 0);
    }

    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int x = 0;
            int y = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target && i != j) {
                        x = i;
                        y = j;
                        break;
                    }
                }
                if (x != 0)
                    break;
            }
            return new int[] { x, y };
        }
    }
}
