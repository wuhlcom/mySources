package collections.list;

import java.util.Arrays;

public class AsList {
    static class Inner{
        static int a1=5;
        static final int a2=5;
        static final int a3 =new Integer(5);
        static final Float[] floatArr1={1.1f,2.2f};
        static final float[] floatArr2={1.1f,2.2f};
    }

    public static void main(String[] args) {
        System.out.println(Inner.a1);
        System.out.println(Inner.a2);
        System.out.println(Inner.a3);
        System.out.println(Arrays.asList(Inner.floatArr1));
        System.out.println(Arrays.asList(Inner.floatArr2));
    }
}
