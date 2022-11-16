package disemvowelTrolls;
import java.util.List;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
    }

    public static class Troll {
        private static final List<String> vowels = List.of(new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"});
        public static String disemvowel(String str) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                String currentLetter = str.substring(i, i+1);
                if (!vowels.contains(currentLetter))
                    result.append(currentLetter);
            }
            return result.toString();
        }
    }
}
