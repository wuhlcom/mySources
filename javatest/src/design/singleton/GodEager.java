package design.singleton;

// 单例，顾名思义，整个系统其实就只有一个实例存在，不能再多，否则就不叫单例
// 一个国家多个神引发宗教冲突
// 痴汉模式（Eager load）
//程序一运行就会创建一个god，无论有没有被调用，占用内存
public class GodEager {
    private static final GodEager god = new GodEager();//自有永有的神单例

    private GodEager() {
    }

    public static GodEager getInstance() {
        return god;
    }
}

