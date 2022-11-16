package disemvowelTrolls;

import java.util.List;

public class BestResolve {
    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
    }

    public static class Troll {
        public static String disemvowel(String str) {
            return str.replaceAll("(?i)[aeiou]" , "");
        }
}
}
