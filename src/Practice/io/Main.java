package Practice.io;

import Practice.io.util.ReverseLetter;

public class Main {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";

        String result = ReverseLetter.reverse(input);

        System.out.println(result);
    }
}