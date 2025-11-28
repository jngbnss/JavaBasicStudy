package javaMid2.collection.map.testV1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("사과",500);
        map.put("바나나",500);
        map.put("망고",1000);
        map.put("딸기",1000);
        Set<String> result = new HashSet<String>();

        for (Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1000){
                result.add(entry.getKey());

            }
        }
        System.out.println("result = " + result);
    }
}
