package step1.chap7;

import java.util.List;
import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[9][9];
        int max = Integer.MIN_VALUE;
        String result = "";

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int a = scanner.nextInt();
                A[i][j] = a;
                if(a > max) {
                    max = a;
                    result = (i+1) +" "+ (j+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(result);



    }
}
