package javaBasic.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        System.out.println("dataA = " + dataA);
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println("dataB = " + dataB);

        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);//20
        System.out.println("dataB.value = " + dataB.value);//10
        //dataB변경
        dataB.value = 30;
        System.out.println("dataA.value = " + dataA.value);//20
        System.out.println("dataB.value = " + dataB.value);//10



    }
}
