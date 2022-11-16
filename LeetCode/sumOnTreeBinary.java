import java.util.HashSet;
import java.util.Set;

public class sumOnTreeBinary {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5 };
    }

    static Set<Integer> hashset = new HashSet<>();

    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (hashset.contains(k - root.val)) {
            return true;
        }
        hashset.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
