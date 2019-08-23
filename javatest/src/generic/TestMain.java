package generic;

public class TestMain {

    public static void main(String[] args) {
        GenClass<Integer> g1 =new GenClass<>(1);
        GenClass g2 =new GenClass<>("泛型类");
        GenClass g3 =new GenClass<>(1000L);
        System.out.println(g1.getKey().getClass());
        System.out.println(g1.getKey());
        System.out.println(g2.getKey().getClass());
        System.out.println(g2.getKey());
        System.out.println(g3.getKey().getClass());
        System.out.println(g3.getKey());
    }
}
