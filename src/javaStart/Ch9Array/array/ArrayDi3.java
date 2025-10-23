package javaStart.Ch9Array.array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 3차원 배열을 만든다
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        for (int i = 0; i < 2; i++) {
            for(int j=0;j <= 2 ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
