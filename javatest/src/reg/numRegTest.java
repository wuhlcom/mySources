package reg;

public class numRegTest {

    public static void main(String[] args) {
        String n="000";
        String m=n.replaceAll("(?<=\\d|0)0+$|^0+$","");
        System.out.println(n);
        System.out.println(m.getClass());


    }
}
