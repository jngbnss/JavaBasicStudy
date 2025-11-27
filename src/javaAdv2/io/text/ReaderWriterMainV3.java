package javaAdv2.io.text;

import static java.nio.charset.StandardCharsets.UTF_8;
import static javaAdv2.io.text.TextConst.FILE_NAME;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class ReaderWriterMainV3 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString = " + writeString);


//        FileOutputStream fos = new FileOutputStream(FILE_NAME);
//        OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);
//        osw.write(writeString);
//        osw.close();

        //파일에 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
        fw.write(writeString);
        fw.close();

        //파일에서 읽기
//        FileInputStream fis = new FileInputStream(FILE_NAME);
//        InputStreamReader isr = new InputStreamReader(fis, UTF_8);

        StringBuilder content = new StringBuilder();
//        FileReader fr = new FileReader(FILE_NAME, UTF_8);
        FileReader fr = new FileReader(FILE_NAME);

//        StringBuilder content = new StringBuilder();
        int ch;
        while((ch=fr.read())!= -1){
            content.append((char) ch);
        }
        fr.close();
        System.out.println("read String : "+content);
    }
}
