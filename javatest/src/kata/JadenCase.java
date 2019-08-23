package kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String string) {
        String newStr = null;
        if (string != null && !string.isEmpty()) {
            newStr = "";
            String[] strArr = string.split(" ");
            for (int i = 0; i < strArr.length; i++) {
                String newWord = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
                if (i == strArr.length - 1) {
                    newStr += newWord;
                } else {
                    newStr += newWord + " ";
                }
            }
        }
        return newStr;
    }

    public String toJadenCase2(String phrase) {
        if(phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for(int x = 0; x < array.length; x++) {
            if(x == 0 || array[x-1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

    public String toJadenCase3(String phrase) {
        if (null == phrase || phrase.length() == 0) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }

    public String toJadenCase4(String phrase) {
        if(phrase == null || phrase.isEmpty()) return null;
        return Arrays.stream(phrase.split("\\s+")).map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .collect(Collectors.joining(" "));
    }



    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        String t = "wo shi shui";
        System.out.println(t.toCharArray());
        System.out.println(t.toCharArray().length);

        System.out.println("abc".toCharArray());
        System.out.println("abc".toCharArray().length);
        System.out.println(jadenCase.toJadenCase(t));
        System.out.println(jadenCase.toJadenCase2(t));
    }
}
