import java.util.HashMap;

/**
 * RansomNote
 */
public class RansomNote {

    public static void main(String[] args) {
        System.out.println(Solution.canConstruct(args[0], args[1]));
    }

    static class Solution {
        public static boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : magazine.toCharArray())
                map.put(c, map.getOrDefault(c, 0) + 1);

            for (char c : ransomNote.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                if (map.get(c) < 0)
                    return false;
            }

            return true;
        }
    }

}