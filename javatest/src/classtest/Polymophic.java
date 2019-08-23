package classtest;

//多态
// 当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
//         但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法，
//         但是它仍然要根据继承链中方法调用的优先级来确认方法，
//         该优先级为：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
public class Polymophic {
    public static class A {
        public String show(D obj) {
            return ("A and D");
        }

        public String show(A obj) {
            return ("A and A");
        }

    }

    public static class B extends A {
        public String show(B obj) {
            return ("B and B");
        }

        public String show(A obj) {
            return ("B and A");
        }
    }

    public static class C extends B {

    }

    public static class D extends B {

    }


    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b)); //A的实例，参数为A的子类B的实例                     1--A and A
        System.out.println("2--" + a1.show(c)); //A的实例，参数为A的子类B,B的子类c                  2--A and A
        System.out.println("3--" + a1.show(d)); //A的实例，参数为A的子类B,B的子类d                  3--A and D
        System.out.println("4--" + a2.show(b)); //A的实例指向子类B的实例，参数为A的子类B的实例        4--B and A
        System.out.println("5--" + a2.show(c)); //A的实例指向子类B的实例，参数为A的子类B,B的子类c     5--B and A
        System.out.println("6--" + a2.show(d)); //A的实例指向子类B的实例，参数为A的子类B,B的子类d     6--A and D
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }

}
