package findMissingChar;

public class BestSolution {
    public static void main(String[] args) {
        System.out.println(Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

    public static class Kata
    {
        public static char findMissingLetter(char[] array) {
            char expectableLetter = array[0];
            for(char letter : array){
                if(letter != expectableLetter) break;
                expectableLetter++;
            }
            return expectableLetter;
        }
    }
}
