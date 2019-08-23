package design.flyweight;


import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, IFlyweight> flyweightHashMap = new HashMap<>();

    //预先实例化对象
    public FlyweightFactory() {
        this.flyweightHashMap.put("x", new ConcreteFlyweight());
        this.flyweightHashMap.put("y", new ConcreteFlyweight());
        this.flyweightHashMap.put("z", new ConcreteFlyweight());
    }


    public IFlyweight getInstance(String key) {
       return this.flyweightHashMap.get(key);
    }
}
