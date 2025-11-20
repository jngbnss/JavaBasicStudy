package javaMid2.collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        // 입력 : 1,2,5,8
        // [null,1,2,...]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println("result = " + result);
        //4번 반복 O(n)


    }
}
