package JsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Str2Json {

    public static Object str2json() {
        String str = "[{\"x\":10,\"y\":20},{\"x\":20,\"y\":20},{\"x\":10,\"y\":10},{\"x\":10,\"y\":20}]";
        JSONArray json = JSON.parseArray(str);
        System.out.println(json);
        for (Object o : json) {
            JSONObject j =JSONObject.parseObject(o.toString());
            System.out.println(j.getFloatValue("x"));
        }
        return json;
    }


}
