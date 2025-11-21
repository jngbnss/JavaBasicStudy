package javaMid2.collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("사과",500);
        map.put("바나나",500);
        map.put("망고",1000);
        map.put("딸기",1000);
        Set<String> result = new HashSet<>();
        //코드 작성
        for (String key : map.keySet()) {
            if(map.get(key)>=1000){
                result.add(key);
            }
        }
        System.out.println(result);
    }
}
