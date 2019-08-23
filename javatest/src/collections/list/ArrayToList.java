package collections.list;

import java.util.HashMap;
import java.util.Map;

public class ArrayToList {

    // 监测类型
    public static final Map<Number, String> FOUCUS_MONITOR_MAP = new HashMap<>();
    static {
        FOUCUS_MONITOR_MAP.put(1, "废水");
        FOUCUS_MONITOR_MAP.put(2, "油烟");
        FOUCUS_MONITOR_MAP.put(3, "餐厨垃圾");
    }

    public static void main(String[] args) {
        System.out.println(FOUCUS_MONITOR_MAP.get(1));
        Byte b=1;
        System.out.println(FOUCUS_MONITOR_MAP.get((int)b));

    }


}
