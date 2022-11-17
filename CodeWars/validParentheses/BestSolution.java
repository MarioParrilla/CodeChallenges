package validParentheses;

import java.util.LinkedList;
import java.util.Queue;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(Solution.validParentheses("(dsgdsg))2432"));
        System.out.println(Solution.validParentheses("())"));
        System.out.println(Solution.validParentheses("()"));
        System.out.println(Solution.validParentheses("(()X)MB)G)9B"));
        System.out.println(Solution.validParentheses("(()))"));
        System.out.println(Solution.validParentheses(");\\(foS[K=LM"));
        System.out.println(Solution.validParentheses("())("));
        System.out.println(Solution.validParentheses("(())"));
    }

    public static class Solution{

        public static boolean validParentheses(String str) {

            int count = 0;

            for(int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == '(') count++;
                else if(str.charAt(i) == ')') count--;
                if(count < 0) return false;
            }
            if(count == 0) return true;
            else return false;
        }
    }
}
