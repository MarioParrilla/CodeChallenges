package validParentheses;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ValidParentheses {
    public static void main(String[] args) {
        //I had to use stack XD but I did it at 2 AM :),
        //anyway I did it, but after a seen the best solution and my face was XD.
        //Finally, I never did this algorithm before, and watching the best solutions I'm learning a lot.
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

        public static boolean validParentheses(String parens) {
            Queue<String> queue = new LinkedList<>();
            for (String s: parens.split("")) {
                if (!queue.isEmpty() && s.equals(")") && queue.peek().equals("("))
                    queue.poll();
                else if (s.equals("("))
                    queue.add("(");
                else if (s.equals(")"))
                    queue.add(")");
            }
            return queue.isEmpty();
        }
    }
}
