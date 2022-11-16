package findMissingChar;

public class FindMissingChar {
    public static void main(String[] args) {
        System.out.println(Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

    public static class Kata
    {
        public static char findMissingLetter(char[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i]+1 != array[i+1])
                    return (char) (array[i]+1);
            }
            return ' ';
        }
    }
}
