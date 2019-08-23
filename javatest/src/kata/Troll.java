package kata;

import java.util.regex.Pattern;

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
       return Pattern.compile("a|e|i|o|u",Pattern.CASE_INSENSITIVE).matcher(str).replaceAll("");
    }

    public static String disemvowel2(String str) {
        // Code away...
        return str.replaceAll("(?i)[aeiou]" , "");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
}