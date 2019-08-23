package kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Write a function that takes an integer as input, and returns the number of bits that are equal to one
// in the binary representation of that number. You can guarantee that input is non-negative.
// Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
public class BitCounting {

    public static int countBits(int n) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int r = 0;
        if (n <= 0) {
            return 0;
        } else {
            while (n > 0) {
                r = n % 2;
                n = n / 2;
                sb.append(r);
            }
        }
        Pattern pattern = Pattern.compile("1");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            count++;
        }
        return count;
        // Show me the code!
    }



        public static int countBits2(int n){

            return Integer.bitCount(n);
        }



}

