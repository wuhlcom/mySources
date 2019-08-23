package design.flyweight.website;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFacotry {

    private Map<String, Website> map = new HashMap<>();

    public Website getInstance(String key) {
        if (!map.containsKey(key)) {
            Website website = new ConcreateWebsite(key);
            map.put(key, website);
        }
        return map.get(key);
    }
}
