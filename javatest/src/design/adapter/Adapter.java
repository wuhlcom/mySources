package design.adapter;

//适配器是国标插头类型，但内部调用欧标插头
//适配器插头是国标插头，但它注入了欧标插头
//对象适配器
public class Adapter implements ChinesePlug {

    private Europlug europlug;


    public Adapter(Europlug europlug) {
        this.europlug = europlug;
    }

    @Override
    public void trianglePlug() {
        europlug.parallelPlug();
    }
}
