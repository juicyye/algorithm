package chap_02;

import java.util.Scanner;

public class 임시반장_11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr =new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k < 6; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if(count > max) {
                max = count;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
