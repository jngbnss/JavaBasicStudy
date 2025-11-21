package javaMid2.collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("유튜브");
        browser.visitPage("구글");
        browser.visitPage("페이스북");

        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}
