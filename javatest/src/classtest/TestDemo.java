package classtest;

public class TestDemo {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.method2();
        //java实例对象可以调用静态方法但一般不推荐用
        demo.method1();

        // demo.mem2="2323";
        // demo.mem1="21213";
        System.out.println(demo.mem2);
        System.out.println(demo.mem1);
        System.out.println(demo);
    }
}
