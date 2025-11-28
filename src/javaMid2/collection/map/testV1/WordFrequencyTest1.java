package javaMid2.collection.map.testV1;

import java.util.HashMap;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] split = text.split(" ");
        for (String s : split) {
            Integer count = map.get(s);
            if(count==null) {
                count = 0;
            }count++;
            map.put(s,count);
        }
        System.out.println(map);
    }
}
