package design.singleton;

// 单例，顾名思义，整个系统其实就只有一个实例存在，不能再多，否则就不叫单例
// 一个国家多个神引发宗教冲突
// 痴汉模式（Eager load）
// 只有某人第一次求神时才实例化，之后再求的就直接返回了。这样的好处是省了一段时间的内存（无求神期间），
//坏处是第一次请神的时候速度相较之前的痴汉模式会慢，因为要消耗CPU去造神
// 其实这么写是在多线程模式下是有陷阱的，试想多人同时并发请神的话，依然会造成多神
public class GodLazy {

    private static  GodLazy god;//这里不进行实例化

    private GodLazy() {
    }

    public static GodLazy getInstance() {
        if(god==null){
            god=new GodLazy();
        }
        return god;
    }
}

