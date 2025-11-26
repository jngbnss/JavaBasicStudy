package javaAdv2.io.buffered;

import static javaAdv2.io.buffered.BufferedConst.BUFFER_SIZE;
import static javaAdv2.io.buffered.BufferedConst.FILE_NAME;
import static javaAdv2.io.buffered.BufferedConst.FILE_SIZE;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 예제3 - 쓰기
public class CreateFileV3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            bos .write(1);
        }
        bos.close(); // 이거 내가 직접 닫는거 너무 번거롭고 놓칠것같은데

        long endTime = System.currentTimeMillis();
        System.out.println("File created: "+FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }
}
