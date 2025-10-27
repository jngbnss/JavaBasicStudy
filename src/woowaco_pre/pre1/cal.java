//package pre1;
//
//import java.util.Scanner;
//
//public class cal {
//    // "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6
//    /**
//     * 1. 입력받기
//     * 2. 숫자모으기
//     * 3. 더하기
//     *
//     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        // 이제여기에서 숫자하나씩 탐색하면서 볼거니까
//        String str =input;
//        String temp ="";
//        int ret =0;
//        for (char c : str) {
//
//            if(c==','||c==':'){
//                // ret+=(int)temp;
//                ret+=Integer.parseInt(temp);
//                temp="";
//            }
//            else{
//                temp += c;
//            }
//
//        }
//        System.out.println("ret = " + ret);
//
//    }
//}
