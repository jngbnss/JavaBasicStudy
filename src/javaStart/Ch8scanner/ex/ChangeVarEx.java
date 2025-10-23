package javaStart.Ch8scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
//        Scanner scanner = new Scanner(System.in);
//         a = scanner.nextInt();
        System.out.println("a = " + a);
//        b = scanner.nextInt();
        System.out.println("b = " + b);

    }
}
