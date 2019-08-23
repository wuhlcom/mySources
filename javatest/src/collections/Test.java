package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        List<Map> ls = tree.createList();
        System.out.println("================原始数据======================");
        System.out.println(ls);

        Map resultMap = tree.classify(ls);

        Set<Integer> keys = resultMap.keySet();
        System.out.println("==============resultMap===================");
        System.out.println(resultMap);

        List<Integer> newKeys = new ArrayList<Integer>();
        newKeys.addAll(keys);
        List<Integer> newKeys2 = new ArrayList<Integer>();
        for (Integer value : newKeys) {
            newKeys2.add(value);
        }

        System.out.println("=================newkeys================");
        System.out.println(newKeys);


        // Map mapAll = null;
        // for (int j = 0; j <= newKeys.size() - 1; j++) {
        //     if (j < 0)
        //         break;
        //
        //     Integer key = (Integer) newKeys.get(j);
        //     if (key == newKeys.get(0)) {
        //         mapAll = resultMap.get(key).get(0);
        //         List sub0 = resultMap.get(key + 1);
        //         mapAll.put("children", sub0);
        //         System.out.println("=================没看懂1================");
        //         System.out.println(mapAll);
        //     }
        //
        //
        //     if (key == newKeys.get(1)) {
        //         Map newMap1 = null;
        //         newMap1 = resultMap.get(key).get(0);
        //         List<Map<String, Object>> sub1 = resultMap.get(key + 1);
        //         List<Map<String, Object>> sub1True = null;
        //         for (Map<String, Object> m : sub1) {
        //             if ((Integer) m.get("lft") > (Integer) newMap1.get("lft") && (Integer) m.get("rgt") < (Integer) newMap1.get("rgt"))
        //                 sub1True.add(m);
        //
        //         }
        //         newMap1.put("children", sub1True);
        //         System.out.println("=================没看懂2================");
        //         System.out.println(mapAll);
        //     }
        //
        //     if (key == newKeys.get(2)) {
        //         Map newMap2 = null;
        //         newMap2 = resultMap.get(key).get(0);
        //         List sub2 = resultMap.get(key + 1);
        //         newMap2.put("children", sub2);
        //         System.out.println("=================没看懂3================");
        //         System.out.println(mapAll);
        //         System.out.println(newMap2);
        //         System.out.println(mapAll.hashCode());
        //         System.out.println(newMap2.hashCode());
        //     }
        //
        //     if (key == newKeys.get(3)) {
        //         Map newMap2 = null;
        //         newMap2 = resultMap.get(key).get(0);
        //         List sub2 = resultMap.get(key + 1);
        //         newMap2.put("children", sub2);
        //     }
        // }
        //
        // System.out.println("=================mapAll================");
        // System.out.println(mapAll);
        // JSONObject js = new JSONObject(mapAll);
        // System.out.println("===================json==================");
        // System.out.println(js.toJSONString());

    }
}
