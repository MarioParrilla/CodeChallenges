package disemvowelTrolls;

import java.util.List;

public class BestResolve {
    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
    }

    public static class Troll {
        private static final List<String> vowels = List.of(new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"});
        public static String disemvowel(String str) {
            return str.replaceAll("(?i)[aeiou]" , "");
        }
}
}
