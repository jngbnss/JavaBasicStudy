package javaMid1.lang.lang.system;

import static java.lang.System.*;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMills = System.currentTimeMillis();
        System.out.println("currentTimeMills = " + currentTimeMills);
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다.
        out.println("getenv() = " + getenv());

        //시스템 속성을 읽는다.
        out.println("getProperties() = " + getProperties());
        out.println("System.getProperty(\"java.version\") = " + getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        arraycopy(originalArray,0,copiedArray,0, originalArray.length);

        out.println("copiedArray = " + copiedArray);
        out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        exit(0);
    }
}
