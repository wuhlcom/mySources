package numbers;

public class IntToHex {

    public static void main(String[] args) {
        int i = 87;
        String str1 = Integer.toHexString(i);
        System.out.println(str1);
        int a = Integer.parseInt("87", 16);
        System.out.println(a);
    }
}
