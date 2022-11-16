package VowelCount;

public class BestResolve {
    public static void main(String[] args) {
        System.out.println(Vowels.getCount("abracadabra"));
    }

    public static class Vowels {

        public static int getCount(String str) {
            return str.replaceAll("[^aeiou]" , "").length();
        }

    }
}
