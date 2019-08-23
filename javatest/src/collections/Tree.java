package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree {

    public List<Map> createList() {
        List<Map> ls = new ArrayList<Map>();

        Map map1 = new HashMap();
        map1.put("name", "研发部");
        map1.put("depth", 1);
        map1.put("pid", 0);
        map1.put("id", 1);
        map1.put("lft", 2);
        map1.put("rgt", 13);

        Map map2 = new HashMap();
        map2.put("name", "开发");
        map2.put("depth", 2);
        map2.put("id", 2);
        map2.put("pid", 1);
        map2.put("lft", 3);
        map2.put("rgt", 10);

        Map map3 = new HashMap();
        map3.put("name", "大数据组");
        map3.put("depth", 3);
        map3.put("id", 3);
        map3.put("pid", 2);
        map3.put("lft", 4);
        map3.put("rgt", 5);

        Map map4 = new HashMap();
        map4.put("name", "环保组");
        map4.put("depth", 3);
        map4.put("pid", 2);
        map4.put("id", 4);
        map4.put("lft", 6);
        map4.put("rgt", 7);

        Map map5 = new HashMap();
        map5.put("name", "测试");
        map5.put("depth", 2);
        map5.put("pid", 11);
        map5.put("id", 12);
        map5.put("lft", 11);
        map5.put("rgt", 12);

        Map map6 = new HashMap();
        map6.put("name", "财务部");
        map6.put("depth", 1);
        map6.put("pid", 4);
        map6.put("id", 6);
        map6.put("lft", 16);
        map6.put("rgt", 19);

        Map map7 = new HashMap();
        map7.put("name", "财务组");
        map7.put("depth", 2);
        map7.put("pid", 4);
        map7.put("id", 6);
        map7.put("lft", 17);
        map7.put("rgt", 18);

        Map map = new HashMap();
        map.put("name", "知路");
        map.put("depth", 0);
        map.put("pid", null);
        map.put("id", 0);
        map.put("lft", 1);
        map.put("rgt", 24);

        ls.add(map);
        ls.add(map1);
        ls.add(map2);
        ls.add(map3);
        ls.add(map4);
        ls.add(map5);
        ls.add(map6);
        ls.add(map7);
        return ls;
    }

    public Map classify(List<Map> ls) {
        /**分组管理*/
        Map<Integer, List<Map<String, Object>>> resultMap = new HashMap<Integer, List<Map<String, Object>>>();
        for (Map<String, Object> stringObjectMap : ls) {
            Integer depth = (Integer) (stringObjectMap.get("depth"));
            if (resultMap.containsKey(depth)) {
                resultMap.get(depth).add(stringObjectMap);
            } else {
                List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
                list.add(stringObjectMap);
                resultMap.put(depth, list);
            }
        }
        return resultMap;
    }

}
