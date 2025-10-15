package pre1;


import java.util.Scanner;
// "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6
public class cal1 {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String temp = "";
        int ret = 0;

        for (char c : input.toCharArray()) {
            if (c == ',' || c == ':') {
                if (!temp.isEmpty()) { // 빈 문자열 방지
                    ret += Integer.parseInt(temp);
                    temp = "";
                }
            }else if(Character.isDigit(c)) {
                temp += c;
            }else{
                throw new IllegalArgumentException("잘못된 값을 입력하셨습니다.");

            }
        }

        // 마지막 숫자도 더하기
        if (!temp.isEmpty()) {
            ret += Integer.parseInt(temp);
        }

        System.out.println("결과 : " + ret);
        // 여기 분석하고 예외하면 되나
        // 일단 읽는게 중요할듯
    }
}

