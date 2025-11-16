package javaMid1.lang.immutable.testReview;

public class ImmutableMyDate {
    private int year;
    private int month;
    private int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear,month,day);
    }

    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }
}
