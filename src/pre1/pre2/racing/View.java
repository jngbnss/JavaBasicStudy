package pre1.pre2.racing;

public class View {
    // 1.컨트롤러에서 런을 실행하면 바로 입력값을 받는 로직
    public void settingPrint(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }
    public void settingTry(){
        System.out.println("시도할 횟수는 몇 회인가요?");
    }
    // 2. 실행결과 보여주는 로직
    //  이름을 받고 조건에 따라서 한줄 추가해주기
    // 실행 결과는 한줄만 보여주는 건데 그냥 그 밑에서 출력을 해야겠다.
    public void run(int n){
        System.out.println("실행 결과");
        while(n>0){
            System.out.println("이름 : "); //짝대기
            // 여기서도 매개변수로 받아야하나
            // 반복하는 로직을 만들어봐야하는데
            // 좀 커질것같다
            // 쪼개는거 염두하기
            n--;
        }
        System.out.println();
    }
    //3.최종 우승자 : 하고 그 다음 이름 배열을 넣어주는 뷰단
    public void callWinner(String winners){
        // 아니면 아예 세팅해서 넘겨버리지 뭐
        // pobi, jun 이렇게
        System.out.println("최종 우승자 : "+winners);
        //뷰단에도 적절하게 들어가는게 맞는것같은데
    }
}
