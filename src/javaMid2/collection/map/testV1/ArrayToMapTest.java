package javaMid2.collection.map.testV1;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][]productArr={
                {"Java","10000"},
                {"Spring","10000"},
                {"Jpa","10000"}
        };

        //주어진 배열로부터 Map생성 - 코드 작성
//        Map<String, String> map = new HashMap<String, String>();
//        for (int i = 0; i < 3; i++)  {
//                map.put(productArr[i][0],productArr[i][1]);
//        }
//
        HashMap<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0],Integer.valueOf(product[1]));
        }
        for (String key : productMap.keySet()) {
            System.out.println(key+" : "+productMap.get(key));
        }

//        for (String s : map.keySet()) {
//            System.out.println("제품: " + s+", 가격:"+map.get(s));
//        }
    }
}
