package proxy.MyProxy;

import java.lang.reflect.*;

public class MyProxy {

    public interface IHello {
        void sayHello();

    }

    static class Hello implements IHello {

        @Override
        public void sayHello() {
            System.out.println("Hello world!");
        }
    }

    // 1.通过实现InvocationHandler接口来自定义自己的InvocationHandler;
    //自定义InvocationHanlder
    static class HWInvocationHanlder implements InvocationHandler {
        //目标对象
        private Object target;

        public HWInvocationHanlder(Object target) {
            this.target = target;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("-----插入前置通知代码----");
            //执行相应的目标方法
            Object rs = method.invoke(target, args);
            System.out.println("-----插入后置处理代码----");
            return rs;
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1 生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 2.通过Proxy.getProxyClass获得动态代理类
        //获取动态代理类
        Class porxyClazz= Proxy.getProxyClass(IHello.class.getClassLoader(),IHello.class);
        // 3.通过反射机制获得代理类的构造方法，方法签名为getConstructor(InvocationHandler.class)
        //获得代理类的构造方法，并传入参数类型InvocationHandler.class
        Constructor constructor=porxyClazz.getConstructor(InvocationHandler.class);
        // 4.通过构造函数获得代理对象并将自定义的InvocationHandler实例对象传为参数传入
        IHello iHello=(IHello) constructor.newInstance(new HWInvocationHanlder(new Hello()));
        // 5.通过代理对象调用目标方法
        iHello.sayHello();
    }

}
