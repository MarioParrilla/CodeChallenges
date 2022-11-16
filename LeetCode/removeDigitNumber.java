import java.util.ArrayList;

public class removeDigitNumber {
    public static void main(String[] args) {

    }

    static class Solution {

        public static String removeDigit(String number, char digit) {
            ArrayList<Character> chars = new ArrayList<>();
            ArrayList<Integer> indexes = new ArrayList<>();
            int max = 0;

            for (char c : number.toCharArray()) {
                chars.add(c);
            }

            for (int i = 0; i < chars.size(); i++) {
                if (chars.get(i) == digit)
                    indexes.add(i);
            }

            int indexesSize = indexes.size();
            int pos = 0;

            while (indexesSize > 0) {
                String aux = "";
                System.out.println(pos + " - val: " + chars.get(indexes.get(pos)));
                System.out.println("Remove: " + chars.remove((int) indexes.get(pos)));

                pos++;

                for (char c : chars)
                    aux += c;
                System.out.println("Aux " + aux);
                if (max < Integer.valueOf(aux))
                    max = Integer.valueOf(aux);
                indexesSize--;
            }
            System.out.println("End");
            return String.valueOf(max);
        }

    }
}
