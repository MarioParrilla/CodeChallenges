package validBraces;

import java.util.Stack;

public class ValidBraces {
    public static void main(String[] args) {
        System.out.println(BraceChecker.isValid("(){}[]"));
        System.out.println(BraceChecker.isValid("([{}])"));
        System.out.println(BraceChecker.isValid("[(])"));
        System.out.println(BraceChecker.isValid("[({})](]"));
        System.out.println(BraceChecker.isValid("(})"));
    }

    public static class BraceChecker {

        public static boolean isValid(String braces) {
            Stack<String> stack = new Stack<>();
            for (String s:braces.split("")) {
                if (s.equals("(") || s.equals("[") || s.equals("{"))
                    stack.add(s);
                else if (!stack.isEmpty() && (s.equals(")") && stack.peek().equals("(")
                        || s.equals("]") && stack.peek().equals("[")
                        || s.equals("}") && stack.peek().equals("{")))
                    stack.pop();
                else return false;
            }
            return stack.isEmpty();
        }
    }
}
