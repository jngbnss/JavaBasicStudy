package javaMid2.collection.map.testV1;

import java.util.*;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B",4);
        map2.put("C",5);
        map2.put("D",6);

        HashMap<String, Integer> common = new HashMap<>();

        for (String key : map1.keySet()) {
            if(map2.containsKey(key)){
                common.put(key,map1.get(key)+map2.get(key));
            }
        }
        System.out.println(common);}
}
