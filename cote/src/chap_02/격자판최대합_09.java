package chap_02;

import java.util.Scanner;

public class 격자판최대합_09 {
    static int solution(int n, int[][] arr) {
        int answer = Integer.MAX_VALUE;
        int sum1,sum2;
        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        sum1=sum2=0;
        for (int i = 0; i < n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr =new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("s = " + solution(n, arr));
    }

}
