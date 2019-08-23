/** 
* @author :wuhongliang wuhongliang@zhilutec.com
* @version :2017年8月28日 下午4:16:29 * 
*/ 
package JsonTest;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonError {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap();
		map.put("xigua", "shule");
		JSONObject js = new JSONObject();		
//		String a =js.getString("did");
		js.put("num", "");
		js.put("double", "1");
		System.out.println("hh:"+js.getInteger("hh"));
		System.out.println("double:"+js.getDouble("double"));
		

	}

}
