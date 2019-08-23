package design.template;

// 咖啡师傅手工冲泡咖啡和茶的流程：
//
// 冲泡咖啡：
// 把水煮沸
// 用沸水冲泡咖啡
// 把咖啡倒入杯子
// 加糖和牛奶
//
// 冲泡茶：
// 把水煮沸
// 用沸水冲泡茶叶
// 把茶倒入杯子
// 加柠檬
//  模版方法实现冲泡咖啡
// 小张去了解了一下模版方法。针对上述冲泡步骤进行了思考。
//
// 应该有一个抽象的对象来描述冲泡饮料这一行为，并且抽象的类实现了具体冲泡对象的共性步骤也就是1.把水煮沸和3.把饮料倒入杯子。有两个具体的子类来具体实现冲泡茶和咖啡。
// 并且有些客户不需要加调料，那么需要对最后一步进行判断，是否添加调料

public abstract class Drinker {

    public final void prepareRecipe() {

        //算法的具体步骤
        boilWater(); //烧水
        brew();//冲泡
        pourInCup();// 把饮料倒入杯子
        if (hook()) {
            addCondiments();// 加调料
        }
    }

    public abstract void brew();

    public abstract void addCondiments();


    public void boilWater() {
        System.out.println("烧水");
    }


    public void pourInCup() {
        System.out.println("把饮料倒入杯子");
    }

    /**
     * 钩子，具体实现可以对算法步骤做一些控制
     *
     * @return
     */
    public boolean hook() {
        return true;
    }


}
