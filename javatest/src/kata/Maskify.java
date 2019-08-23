package kata;

public class Maskify {

    public static String maskify(String str) {
        if (str.length()<4){
            return str;
        }else {
             int x=str.length()-4;
             StringBuilder sb=new StringBuilder();
             for (int i=1;i<=x;i++){
                 sb.append("#");
             }
             return sb.toString()+str.substring(x);
        }

    }

    public static void main(String[] args) {
        String str="12345";
        System.out.println( maskify(str));
        String str2="";
        System.out.println( maskify(str2));
        String str3="2222";
        System.out.println( maskify(str3));
    }
}
