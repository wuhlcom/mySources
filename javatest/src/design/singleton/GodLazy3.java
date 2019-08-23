package design.singleton;

// 单例，顾名思义，整个系统其实就只有一个实例存在，不能再多，否则就不叫单例
// 一个国家多个神引发宗教冲突
// 痴汉模式（Eager load）
// 只有某人第一次求神时才实例化，之后再求的就直接返回了。这样的好处是省了一段时间的内存（无求神期间），
// 这里我们去掉方法上的同步关键字，换到方法体内部做同步，整个方法开放并发大家都可以同时入庙，
//         当然起早贪黑的虔诚信徒们要抢头香是必须要入堂排队的。一旦头香诞生，那其他抢香的都白早起，白排队了。
//         再之后的事情我们都可以预见了，头注香被抢后堂内排队再无必要来了，
//         大家可以在堂外同时并发拜佛求神，这就极大的利用了CPU资源。简而言之：只有第一批抢头香的在排队，之后大家都不必排队了
public class GodLazy3 {

    private static GodLazy3 god;//这里不进行实例化

    private GodLazy3() {
    }

    public static GodLazy3 getInstance() {
        if (god == null) {//如果头柱香未产生，这批抢香人进入堂内排队
            synchronized (GodLazy3.class) {//庙是开放的不用排队进入
                if (god == null) {//只有头香造了神，其他抢香的白排队了
                    god = new GodLazy3();
                }
            }

        }
        //此处头柱香产生后不必再排队
        return god;
    }
}

