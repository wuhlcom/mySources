package proxy.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//cglib没有接口，只有实现类。
//采用字节码增强框架 cglib，在运行时 创建目标类的子类，从而对目标类进行增强
public class CglibBeanFactory {

    public static UserServiceImpl createUserService() {
        //1目标类
        UserServiceImpl userService = new UserServiceImpl();
//2 切面类
        MyAspect myAspect = new MyAspect();
//3 字节码增加
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                myAspect.before("Cglib");
                //执行目标类方法
                Object obj = method.invoke(userService, args);
                //执行代理类的父类
                // methodProxy.invokeSuper(proxy,args);
                myAspect.after("Cglib");
                return obj;
            }
        });
        UserServiceImpl proxyUserService = (UserServiceImpl) enhancer.create();
        return proxyUserService;
    }
}
