package mvcPractice.basic.baseball.practice;
public class StrikeBallResultDto {
    private final int strike;
    private final int ball;
    private int cnt;
    public StrikeBallResultDto(int strike, int ball,int cnt) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    @Override
    public String toString() {
        return strike + " 스트라이크, " + ball + " 볼, 시도 횟수 : "+cnt;
    }
}

