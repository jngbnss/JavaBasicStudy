package javaMid1.lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("Hello Java ");
        }
        String result = stringBuilder.toString();
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = "+(endTime-startTime)+"ms");
    }
}
