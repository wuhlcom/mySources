package proxy.aop;

//切面类
public class MyAspect {

    public void before(String before){
        System.out.println("Before:"+before);
    }

    public void after(String after){
        System.out.println("After:"+after);
    }

}
