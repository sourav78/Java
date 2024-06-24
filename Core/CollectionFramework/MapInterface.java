package CollectionFramework;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        //put()
        map.put("US", "USA");
        map.put("IN", "India");
        map.put("CA", "Canada");
        System.out.println(map);

        //putAll
        Map<String , String> newMap = new HashMap<>();
        newMap.put("EN", "England");

        map.putAll(newMap);
        System.out.println(map);

        //putIfAbsent
        map.putIfAbsent("IN", "Bharat");
        map.putIfAbsent("PAK", "Pakistan");
        System.out.println(map);

        //get()
        System.out.println(map.get("IN"));
        System.out.println(map.get("BAN"));

        //getOrDefault()
        System.out.println(map.getOrDefault("JA", "Others"));

        //containsKey()
        System.out.println(map.containsKey("EN"));
        System.out.println(map.containsKey("JA"));

        //containsValue
        System.out.println(map.containsValue("Canada"));
        System.out.println(map.containsValue("Japan"));

        //replace(K, V)
        map.replace("US", "United State");
        System.out.println(map);

        //replace(K, oldV, newV)
        map.replace("IN", "India", "BHARAT");
        System.out.println(map);

        //remove(K)
        map.remove("PAK");
        System.out.println(map);

        //remove(K, V)
        map.remove("CA", "California");
        System.out.println(map);

        //keySet()
        Set<String> allKeys = map.keySet();
        System.out.println(allKeys);

        //values()
        Collection<String> allValues = map.values();
        System.out.println(allValues);

        //entrySet
        Set<Map.Entry<String, String>> allEntries = map.entrySet();

        System.out.println(allEntries);
    }
}
