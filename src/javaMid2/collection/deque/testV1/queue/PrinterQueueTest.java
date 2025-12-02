package javaMid2.collection.deque.testV1.queue;

import java.util.ArrayDeque;

public class PrinterQueueTest {
    public static void main(String[] args) {
        ArrayDeque<String> print = new ArrayDeque<>();

        print.offer("doc1");
        print.offer("doc2");
        print.offer("doc3");
        while(!print.isEmpty()){
            System.out.println("출력: "+print.poll());
        }
    }
}
