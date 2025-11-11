package javaMid1.lang.math.test;


import java.util.Random;

public class LottoGenerator {
    Random random = new Random();
    int[] lottoNumbers;
    int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;
        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }


    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if(lottoNumbers[i] == number)
                return false;
        }
        return true;
    }
}
