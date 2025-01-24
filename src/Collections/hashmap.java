package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String args[])
    {
    Map<String, Integer> map = new HashMap<>();
        map.put("Rinshid", 10);
        map.put("vijay", 20);
        map.put("ajith", 30);
        System.out.println("Value for 'Alice': " + map.get("Alice"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        String key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println(key + ": " + value);
    }
        map.remove("vijay");
        if (map.containsKey("ajith")) {
        System.out.println("Map contains key 'ajith'.");
    }
}
}
