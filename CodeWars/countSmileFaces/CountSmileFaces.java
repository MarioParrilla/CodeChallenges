package countSmileFaces;

import java.util.List;

public class CountSmileFaces {
    //BEST SOLUTION! YEES
    public static void main(String[] args) {
        System.out.println(SmileFaces.countSmileys(List.of(new String[]{":)", ";(", ";}", ":-D"})));
    }

    public static class SmileFaces {
        public static int countSmileys(List<String> arr) {
            return (int) arr.stream().filter(s -> s.matches("^[:;][-~]?[)D]$")).count();
        }
    }
}
