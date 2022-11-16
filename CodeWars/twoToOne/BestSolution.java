package twoToOne;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }

    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
