package kata;

public class XO {
    public static  boolean getXO(String str) {
        char[] array = str.toCharArray();
        int n = 0, m = 0;
        char x = 'x', o = 'o';
        for (char c : array) {
            c = Character.toLowerCase(c);
            if (c == x) {
                n += 1;
            } else if (c == o) {
                m += 1;
            }
        }

        if ( m == n) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getXO2 (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }

    public static boolean getXO3(String str) {
        int x = 0, o = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toUpperCase().charAt(i) == 'O') o++;
            if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;
    }
}
