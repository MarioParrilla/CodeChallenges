package validBraces;

import java.util.Stack;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(BraceChecker.isValid("(){}[]"));
        System.out.println(BraceChecker.isValid("([{}])"));
        System.out.println(BraceChecker.isValid("[(])"));
        System.out.println(BraceChecker.isValid("[({})](]"));
        System.out.println(BraceChecker.isValid("(})"));
    }

    public static class BraceChecker {

        public static boolean isValid(String braces) {
            Stack<Character> s = new Stack<>();
            for (char c : braces.toCharArray())
                if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
                else s.push(c);
            return s.size() == 0;
        }

        private static boolean isClosing(char x, char c) {
            return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
        }
    }
}
