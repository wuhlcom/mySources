package StringTest;

public class testString {

    public static void main(String[] args) {
        // System.out.println(isCondition("and"));
        // long t =System.currentTimeMillis();
        // System.out.println(t);

        // String res = "0101020801";
        // String str = "0";
        // res = replaceIndex(9, res, str);
        // System.out.println(res);
//		String b = res.substring(0, 9) + str + res.substring(10);
//		sub();
//
//         String uuid = java.util.UUID.randomUUID().toString();
//         System.out.println(uuid);

        String str ="abcdef";
        String strArr[]=str.split(",");
        System.out.println(strArr[0]);

        String spa="A 2 D 3";
        System.out.println(spa.indexOf(" ")+1);
    }

    // public static boolean isCondition(String con) {
    // return (con.toLowerCase()=="and"||con.toLowerCase()=="or");
    // }

    private static String replaceIndex(int index, String res, String str) {
        return res.substring(0, index) + str + res.substring(index + 1);
    }

    public static void sub() {
        // String tcpPosCode = "0101041004";
        // String lastCharacter = tcpPosCode.substring(tcpPosCode.length() - 1);
        // System.out.println(lastCharacter);




    }

}
