package kata;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int count = 0;
        text =text.toUpperCase();
        while (text.length() > 0) {
            String firstLetter  = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(firstLetter)) count++;
            text=text.replaceAll(firstLetter, "");
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aaabdc222";
        System.out.println(duplicateCount(s));
    }
}
