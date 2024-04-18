package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CommonPartFlyweightStoreAndFactory {
    private static Map<String, CommonPart> cache = new HashMap<>();
    public static CommonPart getCommonPart(int number, String text) {
        final String key = number + "-" + text;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        CommonPart newItem = new CommonPart(number, text);
        cache.put(key, newItem);
        return newItem;
    }
}
