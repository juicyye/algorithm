package chap_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 최대매출_03 {
    static int solution(int n, int k, int[] arr) {
        int answer= 0, sum =0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
            answer = sum;
        }
        for (int i = k; i < n; i++) {
            sum+=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //총 일수
        int k = scanner.nextInt(); // 연속몇일
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("solution(n,k,arr) = " + solution(n,k,arr));

    }
}
