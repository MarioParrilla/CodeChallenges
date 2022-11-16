package VowelCount;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(Vowels.getCount("abracadabra"));
    }

    public static class Vowels {

        public static int getCount(String str) {
            return str.length() - str.replaceAll("[aeiou]" , "").length();
        }

    }
}
