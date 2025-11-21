package javaMid2.collection.map.text;

import java.util.HashMap;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};

        HashMap<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0],Integer.valueOf(product[1]));
        }

        for (String key : productMap.keySet()) {
            System.out.println("제품 : "+key+", 가격 : "+productMap.get(key));
        }

//
//        // 주어진 배열로부터 Map 생성 - 코드 작성
//        HashMap<String, String> map = new HashMap<>();
//        map.put(productArr[0][0],productArr[0][1]);
//        map.put(productArr[1][0],productArr[1][1]);
//        map.put(productArr[2][0],productArr[2][1]);
//        // Map의 모든 데이터 출력 - 코드 작성
//        Set<String> keySet = map.keySet();
//        for (String key : keySet) {
//            System.out.println(key+":"+map.get(key));
//        }
    }
}
