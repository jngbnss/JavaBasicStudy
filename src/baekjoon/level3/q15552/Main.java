package baekjoon.level3.q15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(reader.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(reader.readLine());
            bufferedWriter.write((Integer.parseInt(st.nextToken()) +
                    Integer.parseInt(st.nextToken())) + "\n");
        }
        bufferedWriter.close();
    }
}