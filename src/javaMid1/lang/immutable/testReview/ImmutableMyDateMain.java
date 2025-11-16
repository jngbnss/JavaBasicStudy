package javaMid1.lang.immutable.testReview;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 1, 1);
        ImmutableMyDate immutableMyDate1 = new ImmutableMyDate(2024, 1, 1);
        MyDate date2 = date1;
        ImmutableMyDate immutableMyDate2 = immutableMyDate1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1.setYear(2025);
        immutableMyDate1 = immutableMyDate1.withYear(2025);
        System.out.println("immutableMyDate1 = " + immutableMyDate1);
        System.out.println("immutableMyDate2 = " + immutableMyDate2);
    }
}
