package exercise;

import java.util.*;

// BEGIN
class App {
    private static final String ADDED = "added";
    private static final String DELETED = "deleted";
    private static final String CHANGED = "changed";
    private static final String UNCHANGED = "unchanged";

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Set<String> keys = new TreeSet<>();
        LinkedHashMap<String, String> compareMaps = new LinkedHashMap<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        for (String key : keys) {
            if (!map1.containsKey(key)) {
                compareMaps.put(key, ADDED);
            } else if (!map2.containsKey(key)) {
                compareMaps.put(key, DELETED);
            } else if (map1.get(key).equals(map2.get(key))) {
                compareMaps.put(key, UNCHANGED);
            } else {
                compareMaps.put(key, CHANGED);
            }
        }
        return compareMaps;
    }
}
//END
