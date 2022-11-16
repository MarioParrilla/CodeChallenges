
public class RomanToInteger {

    public static void main(String[] args) {
        var x = romanToInt("MDCLI");
        System.out.println(String.format("Int: %s", x));
    }

    public static int romanToInt(String s) {
        int result = 0;
        if (s.length() <= 15) {
            char[] nums = s.toCharArray();
            char previous = '0';

            for (char c : nums) {
                if (previous != 'I' && previous != 'X' && previous != 'C' && previous != 'V' && previous != 'L'
                        && previous != 'D') {
                    previous = '0';
                }
                int num = getNumberFromRoman(c, previous);
                result += num;
                previous = c;
                System.out.println(" = " + result);
            }
        }
        return result;
    }

    public static int getNumberFromRoman(char newC, char previousC) {
        char[] c = new char[] { newC, previousC };

        System.out.print(String.format("[%s,%s]", c[0], c[1]));

        int diff = switch (String.format("[%s,%s]", c[0], c[1])) {
            case "[V,I]" -> 1;
            case "[I,V]" -> 5;
            case "[X,I]" -> 1;
            case "[L,X]" -> 10;
            case "[X,L]" -> 50;
            case "[C,X]" -> 10;
            case "[D,C]" -> 100;
            case "[C,D]" -> 500;
            case "[M,C]" -> 100;
            default -> 0;
        };

        return switch (String.format("[%s,%s]", c[0], c[1])) {
            case "[I,0]", "[I,I]", "[I,C]", "[I,X]", "[I,L]", "[I,D]" -> 1;
            case "[V,I]" -> 4 - diff;
            case "[V,0]", "[V,V]", "[V,L]", "[V,D]", "[V,X]", "[V,C]", "[V,M]" -> 5;
            case "[I,V]" -> 6 - diff;
            case "[X,I]" -> 9 - diff;
            case "[X,0]", "[X,X]", "[X,C]", "[X,M]", "[X,D]", "[X,V]" -> 10;
            case "[L,X]" -> 40 - diff;
            case "[L,0]", "[L,L]", "[L,V]", "[L,D]", "[L,C]", "[L,I]", "[L,M]" -> 50;
            case "[X,L]" -> 60 - diff;
            case "[C,X]" -> 90 - diff;
            case "[C,0]", "[C,C]", "[C,I]", "[C,M]", "[C,V]", "[C,L]" -> 100;
            case "[D,C]" -> 400 - diff;
            case "[D,0]", "[D,D]", "[D,L]", "[D,V]" -> 500;
            case "[C,D]" -> 600 - diff;
            case "[M,C]" -> 900 - diff;
            case "[M,0]", "[M,M]" -> 1000;
            default -> 0;
        };
    }
}