package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//cglib不需要接口
//cglib通过创建目标类的子类实现代理
public class MyBeanFactory {

    public static UserServiceImpl createUserService() {
        final UserServiceImpl userServiceImpl = new UserServiceImpl();
        final MyAspect myAspect = new MyAspect();

        //1 核心类
        Enhancer enhancer = new Enhancer();
        //2 确定父类
        enhancer.setSuperclass(userServiceImpl.getClass());
        //3 设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

                myAspect.before();
                Object obj =method.invoke(userServiceImpl, args);
                myAspect.after();

                return obj;
            }
        });

        //4 创建代理
        UserServiceImpl proxy = (UserServiceImpl) enhancer.create();
        return proxy;
    }
}
