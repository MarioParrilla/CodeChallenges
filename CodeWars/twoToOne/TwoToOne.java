package twoToOne;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }

    public static String longest (String s1, String s2) {
        StringBuilder result = new StringBuilder();
        Set<String> all = new LinkedHashSet<>(List.of((s1+s2).split("")));
        all.stream().sorted().forEach(result::append);
        return result.toString();
    }
}
