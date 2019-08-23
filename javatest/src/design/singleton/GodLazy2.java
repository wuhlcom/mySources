package design.singleton;

// 单例，顾名思义，整个系统其实就只有一个实例存在，不能再多，否则就不叫单例
// 一个国家多个神引发宗教冲突
// 痴汉模式（Eager load）
// 只有某人第一次求神时才实例化，之后再求的就直接返回了。这样的好处是省了一段时间的内存（无求神期间），
// 然而，这样做是要付出代价的，还没进庙呢不管三七二十一请神的直接给加锁排队，
//         结果队伍从北边的庙排到了南天门，人们都要来一个一个拜佛求神，
//         这造成了巨大时间浪费，没有充分利用CPU资源并发优势（特别是多核情况）。好吧，那还是让人们抢好了，但依然得保证单例神的情况下
public class GodLazy2 {

    private static GodLazy2 god;//这里不进行实例化

    private GodLazy2() {
    }

    public static synchronized GodLazy2 getInstance() {//同步锁
        if(god==null){
            god=new GodLazy2();
        }
        return god;
    }
}

